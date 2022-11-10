package net.amik.coursemod.block.custom;

import net.amik.coursemod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class PancakeCropBlock extends BeetrootBlock {

    public PancakeCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.PANCAKE.get();
    }
}
