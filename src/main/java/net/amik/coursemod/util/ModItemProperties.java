package net.amik.coursemod.util;

import net.amik.coursemod.CourseMod;
import net.amik.coursemod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties(){
        ItemProperties.register(ModItems.DATA_TABLET.get(), new ResourceLocation(CourseMod.MOD_ID, "on"),((pStack, pLevel, pEntity, pSeed) ->
                pStack.hasTag() ? 1f : 0f));
    }
}
