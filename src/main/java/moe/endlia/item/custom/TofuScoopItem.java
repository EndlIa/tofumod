package moe.endlia.item.custom;

import moe.endlia.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TofuScoopItem extends Item {
    public TofuScoopItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient) {
            World world = context.getWorld();
            BlockPos pos = context.getBlockPos();
            Block block = context.getWorld().getBlockState(pos).getBlock();
            if (block.getDefaultState().isOf(ModBlocks.MOMEN_TOFU_BLOCK)) {
                ItemStack stack = block.asItem().getDefaultStack();
                ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
                world.breakBlock(pos, false);
                world.spawnEntity(itemEntity);
            }
        }
        return ActionResult.SUCCESS;
    }

}
