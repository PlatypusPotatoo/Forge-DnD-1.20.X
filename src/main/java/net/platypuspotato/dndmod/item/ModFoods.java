package net.platypuspotato.dndmod.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;

public class ModFoods {
    public static final FoodProperties GOODBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 5), 0.5f).build();

}
