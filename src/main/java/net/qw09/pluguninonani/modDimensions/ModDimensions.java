package net.qw09.pluguninonani.modDimensions;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.qw09.pluguninonani.item.ModItems;
import net.qw09.pluguninonani.pluguninonani;

public class ModDimensions {
    public static final RegistryKey<World> QW09DIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(pluguninonani.MOD_ID, "qw09dim"));
    public static final RegistryKey<DimensionType> QW09DIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, QW09DIM_DIMENSION_KEY.getValue());

    public static void register(){
        pluguninonani.LOGGER.debug("registering mod dimendions for" + pluguninonani.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.NETHERITE_BLOCK)
                .destDimID(QW09DIM_DIMENSION_KEY.getValue()).tintColor(0,0,255).lightWithItem(ModItems.DARKNESS).registerPortal();

    }

}
