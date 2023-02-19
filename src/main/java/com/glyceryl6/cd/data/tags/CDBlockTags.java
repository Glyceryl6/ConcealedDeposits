package com.glyceryl6.cd.data.tags;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CDBlockTags {

    private static TagKey<Block> create(String name) {
        return BlockTags.create(ConcealedDeposits.prefix(name));
    }

}