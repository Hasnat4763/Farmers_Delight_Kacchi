package net.hasnat4763.kacchi.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties KACCHI = new FoodProperties
            .Builder()
            .nutrition(3)
            .saturationMod(5)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000, 2),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 3),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1000, 3),1.0f)
            .build();
    public static final FoodProperties YOGURT = new FoodProperties
        .Builder()
        .nutrition(3)
        .saturationMod(5)
        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 3),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1000, 3),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1000, 3),1.0f)
        .build();
}