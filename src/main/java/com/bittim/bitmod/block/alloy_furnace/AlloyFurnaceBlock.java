package com.bittim.bitmod.block.alloy_furnace;

import java.util.Random;
import java.util.function.ToIntFunction;

import javax.annotation.Nullable;

import com.bittim.bitmod.setup.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

public class AlloyFurnaceBlock extends Block
{
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public AlloyFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new AlloyFurnaceTileEntity();
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if(world.isClientSide) return ActionResultType.SUCCESS;

        this.interactWith(world, pos, player);
        return ActionResultType.CONSUME;
    }

    private void interactWith(World world, BlockPos pos, PlayerEntity player)
    {
        TileEntity tileEntity = world.getBlockEntity(pos);
        if(tileEntity instanceof AlloyFurnaceTileEntity && player instanceof ServerPlayerEntity)
        {
            AlloyFurnaceTileEntity te = (AlloyFurnaceTileEntity) tileEntity;
            NetworkHooks.openGui((ServerPlayerEntity) player, te, te::encodeExtraData);
        }
    }

    @OnlyIn(Dist.CLIENT)
   public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
      if (state.getValue(LIT)) {
         double x = (double)pos.getX() + 0.5D;
         double y = (double)pos.getY();
         double z = (double)pos.getZ() + 0.5D;
         if (rand.nextDouble() < 0.1D) {
            world.playLocalSound(x, y, z, SoundEvents.BLASTFURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
         }

         Direction direction = state.getValue(FACING);
         Direction.Axis direction$axis = direction.getAxis();
         
         double dOff = rand.nextDouble() * 0.6D - 0.3D;
         double xOff = direction$axis == Direction.Axis.X ? (double)direction.getStepX() * 0.52D : dOff;
         double yOff = rand.nextDouble() * 9.0D / 16.0D;
         double zOff = direction$axis == Direction.Axis.Z ? (double)direction.getStepZ() * 0.52D : dOff;

         world.addParticle(ParticleTypes.SMOKE, x + xOff, y + yOff, z + zOff, 0.0D, 0.0D, 0.0D);
      }
   }

   public static ToIntFunction<BlockState> lightLevel = (state) -> state.getValue(LIT) ? 13 : 0;

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(LIT, false);
    }

    public static void setLitState(boolean lit, World world, BlockPos pos)
    {
        BlockState state = world.getBlockState(pos);
        TileEntity tileEntity = world.getBlockEntity(pos);

        world.setBlock(pos, ModBlocks.ALLOY_FURNACE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(LIT, lit), 3);
        if(tileEntity != null)
        {
            tileEntity.setChanged();
            world.setBlockEntity(pos, tileEntity);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onRemove(BlockState state, World world, BlockPos pos, BlockState newState, boolean isMoving) {
        if(!state.is(newState.getBlock()))
        {
            TileEntity tileEntity = world.getBlockEntity(pos);
            if(tileEntity instanceof IInventory)
            {
                InventoryHelper.dropContents(world, pos, (IInventory)tileEntity);
                world.updateNeighbourForOutputSignal(pos, this);
            }

            super.onRemove(state, world, pos, newState, isMoving);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
        builder.add(LIT);
    }
}
