package net.qw09.pluguninonani.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qw09.pluguninonani.block.ModBlocks;
import net.qw09.pluguninonani.pluguninonani;

public class ModItems {
    public static final Item QUICK_ONE = registerItem("quick_one",
            new AliasedBlockItem(ModBlocks.QUICK_ONE_CROP, new FabricItemSettings().food(ModFoodComponents.QUICK_ONE)));
    public static final Item DARKNESS_SWORD = registerItem("darkness_sword",
            new SwordItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_PICKAXE = registerItem("darkness_pickaxe",
            new PickaxeItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_AXE = registerItem("darkness_axe",
            new AxeItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_SHOVEL = registerItem("darkness_shovel",
            new ShovelItem(ModToolMaterial.DARKNESS, 100, 100f ,new FabricItemSettings()));
    public static final Item DARKNESS_HELMET = registerItem("darkness_helmet",
            new ArmorItem(modArmor.DARKNESS, ArmorItem.Type.HELMET , new FabricItemSettings()));
    public static final Item OAK_HELMET = registerItem("oak_helmet",
            new ArmorItem(modArmor.WOOD, ArmorItem.Type.HELMET , new FabricItemSettings()));
    public static final Item OAK_BOOTS = registerItem("oak_boots",
            new ArmorItem(modArmor.WOOD, ArmorItem.Type.BOOTS , new FabricItemSettings()));
    public static final Item OAK_LEGGINGS = registerItem("oak_leggings",
            new ArmorItem(modArmor.WOOD, ArmorItem.Type.LEGGINGS , new FabricItemSettings()));
    public static final Item OAK_CHESTPLATE = registerItem("oak_chestplate",
            new ArmorItem(modArmor.WOOD, ArmorItem.Type.CHESTPLATE , new FabricItemSettings()));
    public static final Item DARKNESS_CHESTPLATE = registerItem("darkness_chestplate",
            new ArmorItem(modArmor.DARKNESS, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item DARKNESS_LEGGINGS = registerItem("darkness_leggings",
            new ArmorItem(modArmor.DARKNESS,ArmorItem.Type.LEGGINGS ,new FabricItemSettings()));
    public static final Item DARKNESS_BOOTS = registerItem("darkness_boots",
            new ArmorItem(modArmor.DARKNESS, ArmorItem.Type.BOOTS ,new FabricItemSettings()));
    public static final Item DARKNESS = registerItem("darkness", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(DARKNESS_SWORD);
        entries.add(DARKNESS);
        entries.add(DARKNESS_SHOVEL);
        entries.add(DARKNESS_AXE);
        entries.add(DARKNESS_PICKAXE);
        entries.add(DARKNESS_BOOTS);
        entries.add(DARKNESS_CHESTPLATE);
        entries.add(DARKNESS_HELMET);
        entries.add(DARKNESS_LEGGINGS);
        entries.add(OAK_HELMET);
        entries.add(OAK_LEGGINGS);
        entries.add(OAK_CHESTPLATE);
        entries.add(OAK_BOOTS);
        entries.add(QUICK_ONE);


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(pluguninonani.MOD_ID, name), item);
    }
    public static void RegisterModItems(){

        pluguninonani.LOGGER.info("registering items for" + pluguninonani.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }
}
