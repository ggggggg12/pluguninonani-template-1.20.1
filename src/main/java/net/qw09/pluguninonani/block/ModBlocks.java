package net.qw09.pluguninonani.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.qw09.pluguninonani.pluguninonani;

public class ModBlocks {

    public static final Block DARKNESS_ORE = registerBlock("darkness_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(DARKNESS_ORE);
    }


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(pluguninonani.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(pluguninonani.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }



    public static void registerModBlocks(){
        pluguninonani.LOGGER.info("registring mod blocks for" + pluguninonani.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToIngredientTab);
    }
}
