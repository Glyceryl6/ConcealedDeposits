package com.glyceryl6.cd.utils;

import com.glyceryl6.cd.registry.CDItems;
import com.glyceryl6.cd.registry.CDTabs;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CDItemUtils {

    public static RegistryObject<Item> normal(String name) {
        return CDItems.ITEMS.register(name, () -> new Item(defaultBuilder()));
    }

    public static RegistryObject<Item> alias(String name, RegistryObject<Block> block) {
        return CDItems.ITEMS.register(name, () -> new ItemNameBlockItem(block.get(), defaultBuilder()));
    }

    public static RegistryObject<Item> spawnEgg(String name, Supplier<? extends EntityType<? extends Mob>> type, int backgroundColor, int highlightColor) {
        return CDItems.ITEMS.register(name + "_spawn_egg", () -> new ForgeSpawnEggItem(type, backgroundColor, highlightColor, defaultBuilder()));
    }

    private static Item.Properties defaultBuilder() {
        return new Item.Properties().tab(CDTabs.CD_TAB_0);
    }

}