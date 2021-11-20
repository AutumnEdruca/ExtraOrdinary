package com.autumn.extraordinary.item;

import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods extends Foods {
    public static final FoodProperties ZOMBIE_HEART = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_ZOMBIE_HEART = (new FoodProperties.Builder()).nutrition(7).saturationMod(1F).build();


}
