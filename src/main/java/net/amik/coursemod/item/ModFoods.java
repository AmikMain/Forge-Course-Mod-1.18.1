package net.amik.coursemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PANCAKE = new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200), 0.1f /*Шанс эффекта*/ ).build();
}
