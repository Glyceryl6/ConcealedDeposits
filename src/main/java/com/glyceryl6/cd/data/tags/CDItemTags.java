package com.glyceryl6.cd.data.tags;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CDItemTags {

    private static TagKey<Item> create(String name) {
        return ItemTags.create(ConcealedDeposits.prefix(name));
    }

}