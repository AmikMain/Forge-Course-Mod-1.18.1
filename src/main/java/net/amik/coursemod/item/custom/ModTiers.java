package net.amik.coursemod.item.custom;

import net.amik.coursemod.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TUNGSTEN = new ForgeTier(2,1000,0f,2f,
    10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));
    //Ingredient.of = Чем чинить
}
