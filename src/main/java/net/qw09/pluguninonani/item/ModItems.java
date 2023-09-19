package net.qw09.pluguninonani.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qw09.pluguninonani.pluguninonani;

public class ModItems {

    public static final Item DARKNESS = registerItem("darkness", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(DARKNESS);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(pluguninonani.MOD_ID, name), item);
    }
    public static void RegisterModItems(){

        pluguninonani.LOGGER.info("registering items for" + pluguninonani.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
