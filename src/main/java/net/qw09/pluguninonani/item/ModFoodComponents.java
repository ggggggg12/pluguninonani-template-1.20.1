package net.qw09.pluguninonani.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent QUICK_ONE = new FoodComponent.Builder().hunger(1000).saturationModifier(100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200000000, 255), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 10000000, 255), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100000000, 255),1.0f).build();

}

