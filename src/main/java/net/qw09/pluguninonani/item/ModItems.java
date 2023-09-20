package net.qw09.pluguninonani.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qw09.pluguninonani.pluguninonani;

public class ModItems {
    public static final Item DARKNESS_SWORD = registerItem("darkness_sword",
            new SwordItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_PICKAXE = registerItem("darkness_pickaxe",
            new PickaxeItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_AXE = registerItem("darkness_axe",
            new AxeItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_SHOVEL = registerItem("darkness_shovel",
            new ShovelItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS = registerItem("darkness", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(DARKNESS_SWORD);
        entries.add(DARKNESS);
        entries.add(DARKNESS_SHOVEL);
        entries.add(DARKNESS_AXE);
        entries.add(DARKNESS_PICKAXE);


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(pluguninonani.MOD_ID, name), item);
    }
    public static void RegisterModItems(){

        pluguninonani.LOGGER.info("registering items for" + pluguninonani.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
