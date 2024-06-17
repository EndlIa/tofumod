package moe.endlia.tofumod.item.custom;

import moe.endlia.tofumod.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TofuBugleItem extends Item {
    public TofuBugleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            BlockPos pos = user.getBlockPos();
            world.playSound(null, pos, ModSounds.TOFU_BUGLE,
                    SoundCategory.BLOCKS, 1f, 1f);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

}
