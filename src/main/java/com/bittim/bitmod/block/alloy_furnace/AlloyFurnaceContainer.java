package com.bittim.bitmod.block.alloy_furnace;

import com.bittim.bitmod.setup.ModContainers;
import com.bittim.bitmod.setup.ModTags;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;
import net.minecraftforge.common.ForgeHooks;

public class AlloyFurnaceContainer extends Container
{
    private final IInventory inventory;
    private IIntArray fields;

    public AlloyFurnaceContainer(int windowID, PlayerInventory playerInventory, PacketBuffer buffer)
    {
        this(windowID, playerInventory, new AlloyFurnaceTileEntity(), new IntArray(buffer.readByte()));
    }

    public AlloyFurnaceContainer(int windowID, PlayerInventory playerInventory, IInventory inventory, IIntArray fields)
    {
        super(ModContainers.ALLOY_FURNACE.get(), windowID);

        this.inventory = inventory;
        this.fields = fields;

        layoutPlayerInventorySlots(playerInventory, 8, 84);

        this.addSlot(new Slot(this.inventory, 0, 56, 16) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return ModTags.Items.ALLOYABLE_ITEMS.contains(stack.getItem());
            }
        });

        this.addSlot(new Slot(this.inventory, 1, 56, 53) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return ModTags.Items.ALLOYABLE_ITEMS.contains(stack.getItem());
            }
        });

        this.addSlot(new Slot(this.inventory, 2, 8, 53) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                if(ForgeHooks.getBurnTime(stack, IRecipeType.SMELTING) > 0) return true;
                return false;
            }
        });

        this.addSlot(new Slot(this.inventory, 3, 116, 35) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }
        });

        this.addDataSlots(fields);
    }

    public int getProgressArrowScale()
    {
        int cookTime = fields.get(0);
        int totalCookTime = fields.get(1);

        if(cookTime > 0 && totalCookTime > 0) return cookTime * 47 / totalCookTime;
        return 0;
    }

    public int getFuelBurnScale()
    {
        int currentBurnTime = fields.get(3);
        int burnTime = fields.get(2);

        if(currentBurnTime < burnTime && burnTime > 0) return currentBurnTime * 14 / burnTime;
        return 0;
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return this.inventory.stillValid(player);
    }
    
    private int addSlotRange(PlayerInventory inv, int index, int x, int y, int amount, int dx) {
        for (int i = 0; i < amount; i++) {
            this.addSlot(new Slot(inv, index, x, y));
            x += dx;
            index++;
        }

        return index;
    }

    private int addSlotBox(PlayerInventory inv, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0; j < verAmount; j++) {
            index = addSlotRange(inv, index, x, y, horAmount, dx);
            y += dy;
        }

        return index;
    }

    private void layoutPlayerInventorySlots(PlayerInventory playerInventory, int leftCol, int topRow) {
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }



    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 4;  // must match TileEntityInventoryBasic.NUMBER_OF_SLOTS

    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int index) {
        Slot sourceSlot = this.slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(player, sourceStack);
        return copyOfSourceStack;
    }
}
