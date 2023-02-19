package com.glyceryl6.cd.data.loot;

import com.glyceryl6.cd.registry.CDBlocks;
import com.google.common.collect.Sets;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.function.BiConsumer;

public class CDBlockLoot extends BlockLoot {

    @Override
    protected void addTables() {

    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
        this.addTables();
        Set<ResourceLocation> set = Sets.newHashSet();
        for (Block block : this.getKnownBlocks()) {
            ResourceLocation resource = block.getLootTable();
            if (resource != BuiltInLootTables.EMPTY && set.add(resource)) {
                LootTable.Builder lootTable$builder = this.map.remove(resource);
                if (lootTable$builder != null) {
                    biConsumer.accept(resource, lootTable$builder);
                }
            }
        }

        if (!this.map.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + this.map.keySet());
        }
    }

    @Nonnull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CDBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}