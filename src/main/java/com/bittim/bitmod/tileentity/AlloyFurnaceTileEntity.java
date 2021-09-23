package com.bittim.bitmod.tileentity;

import javax.annotation.Nullable;

import com.bittim.bitmod.block.alloy_furnace.AlloyFurnaceBlock;
import com.bittim.bitmod.container.AlloyFurnaceContainer;
import com.bittim.bitmod.recipe.AlloyingRecipe;
import com.bittim.bitmod.recipe.ModRecipes;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class AlloyFurnaceTileEntity extends LockableTileEntity implements ISidedInventory, ITickableTileEntity
{
    private static final int[] SLOTS_FOR_UP = new int[]{2};
    private static final int[] SLOTS_FOR_DOWN = new int[]{3};
    private static final int[] SLOTS_FOR_SIDES = new int[]{0, 1};

    private NonNullList<ItemStack> items;
    private final LazyOptional<? extends IItemHandler>[] handlers;

    private boolean isLit = false;
    private int cookTime = 0;
    private int totalCookTime = 0;
    private int burnTime = 1;
    private int currentBurnTime = 0;

    private final IIntArray fields = new IIntArray()
    {
        @Override
        public int get(int index) {
            switch(index)
            {
            case 0:
                return cookTime;
            
            case 1:
                return totalCookTime;
            
            case 2:
                return burnTime;
            
            case 3:
                return currentBurnTime;

            default:
                return 0;
            }
        }

        @Override
        public void set(int index, int value) {
            switch(index)
            {
            case 0:
                cookTime = value;
                break;
                
            case 1:
                totalCookTime = value;
                break;

            case 2:
                burnTime = value;
                break;

            case 3:
                currentBurnTime = value;
                break;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    };

    public AlloyFurnaceTileEntity()
    {
        super(ModTileEntities.ALLOY_FURNACE.get());
        this.handlers = SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
        this.items = NonNullList.withSize(4, ItemStack.EMPTY);
    }
    
    public void encodeExtraData(PacketBuffer buffer)
    {
        buffer.writeByte(fields.getCount());
    }

    @Override
    public void tick()
    {
        if(this.level == null || this.level.isClientSide) return;

        AlloyingRecipe recipe = getRecipe();
        doBurn(getItem(2), recipe);

        if(recipe != null) doWork(recipe);
        else stopWork();
    }

    @Nullable
    public AlloyingRecipe getRecipe()
    {
        if(this.level == null || getItem(0).isEmpty() || getItem(1).isEmpty()) return null;
        return this.level.getRecipeManager().getRecipeFor(ModRecipes.Types.ALLOYING, this, this.level).orElse(null);
    }

    private ItemStack getWorkOutput(@Nullable AlloyingRecipe recipe)
    {
        if(recipe != null) return recipe.assemble(this);
        return ItemStack.EMPTY;
    }

    private void doWork(AlloyingRecipe recipe)
    {
        assert this.level != null;

        ItemStack current = getItem(3);
        ItemStack output = getWorkOutput(recipe);

        totalCookTime = recipe.getCookTime();

        if(!current.isEmpty())
        {
            int newCount = current.getCount() + output.getCount();

            ItemStack currentItem = current.copy();
            currentItem.setCount(1);

            ItemStack outputItem = output.copy();
            outputItem.setCount(1);

            if(!ItemStack.matches(currentItem, outputItem) || newCount > output.getMaxStackSize())
            {
                stopWork();
                return;
            }
        }

        if(!isLit)
        {
            stopWork();
            return;
        }

        if(cookTime < totalCookTime) { ++cookTime; }
        if(cookTime >= totalCookTime) finishWork(recipe, current, output);
    }

    private void stopWork() { cookTime = 0; }

    private void finishWork(AlloyingRecipe recipe, ItemStack current, ItemStack output)
    {
        if(!current.isEmpty()) current.grow(output.getCount());
        else setItem(3, output);

        cookTime = 0;
        this.removeItem(0, 1);
        this.removeItem(1, 1);
    }

    private void doBurn(ItemStack fuel, AlloyingRecipe recipe)
    {
        if(currentBurnTime <= 0 && recipe != null) refuel(fuel);
        if(currentBurnTime > 0) --currentBurnTime;
    }

    @SuppressWarnings("deprecation")
    private void refuel(ItemStack fuel)
    {
        if(!fuel.isEmpty())
        {
            burnTime = ForgeHooks.getBurnTime(fuel);
            currentBurnTime = burnTime;
            fuel.shrink(1);
            
            isLit = true;
        } else {
            isLit = false;
        }
        
        AlloyFurnaceBlock.setLitState(isLit, this.level, this.worldPosition);
    }
    
    @Override
    public int[] getSlotsForFace(Direction direction)
    {
        if (direction == Direction.DOWN) {
            return SLOTS_FOR_DOWN;
         } else {
            return direction == Direction.UP ? SLOTS_FOR_UP : SLOTS_FOR_SIDES;
         }
    }
    
    @Override
    public boolean canPlaceItemThroughFace(int index, ItemStack stack, Direction direction)
    {
        return this.canPlaceItem(index, stack);
    }
    
    @Override
    public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction)
    {
        return index == 3;
    }
    
    @Override
    protected ITextComponent getDefaultName()
    {
        return new TranslationTextComponent("container.bitmod.alloy_furnace");
    }
    
    @Override
    protected Container createMenu(int id, PlayerInventory inv)
    {
        return new AlloyFurnaceContainer(id, inv, this, this.fields);
    }

    @Override
    public int getContainerSize()
    {
        return 4;
    }

    @Override
    public boolean isEmpty()
    {
        return getItem(0).isEmpty() &&getItem(1).isEmpty() && getItem(2).isEmpty() && getItem(3).isEmpty();
    }

    @Override
    public ItemStack getItem(int index)
    {
        return items.get(index);
    }

    @Override
    public ItemStack removeItem(int index, int count)
    {
        return ItemStackHelper.removeItem(items, index, count);
    }

    @Override
    public ItemStack removeItemNoUpdate(int index)
    {
        return ItemStackHelper.takeItem(items, index);
    }

    @Override
    public void setItem(int index, ItemStack stack)
    {
        items.set(index, stack);
    }

    @Override
    public boolean stillValid(PlayerEntity player)
    {
        return this.level != null
            && this.level.getBlockEntity(this.worldPosition) == this
            && player.distanceToSqr(this.worldPosition.getX() + 0.5f, this.worldPosition.getY() + 0.5f, this.worldPosition.getZ()) <= 64;
    }

    @Override
    public void clearContent()
    {
        items.clear();
    }

    @Override
    public void load(BlockState state, CompoundNBT tags) {
        super.load(state, tags);
        this.items = NonNullList.withSize(4, ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(tags, this.items);

        this.cookTime = tags.getInt("Progress");
    }

    @Override
    public CompoundNBT save(CompoundNBT tags) {
        super.save(tags);
        ItemStackHelper.saveAllItems(tags, this.items);

        tags.putInt("Progress", this.cookTime);
        return tags;
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT tags = this.getUpdateTag();
        ItemStackHelper.saveAllItems(tags, this.items);
        return new SUpdateTileEntityPacket(this.worldPosition, 1, tags);
    }

    @Override
    public CompoundNBT getUpdateTag() {
        CompoundNBT tags = super.getUpdateTag();
        tags.putInt("Progress", this.cookTime);
        return tags;
    }

    @Nullable
    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
        if(!this.remove && side != null && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            if(side == Direction.UP)
                return this.handlers[0].cast();
            else if(side == Direction.DOWN)
                return this.handlers[1].cast();
            else
                return this.handlers[2].cast();
        } else {
            return super.getCapability(cap, side);
        }
    }

    @Override
    public void setRemoved() {
        super.setRemoved();

        for (LazyOptional<? extends IItemHandler> handler : this.handlers) {
            handler.invalidate();
        }
    }
}