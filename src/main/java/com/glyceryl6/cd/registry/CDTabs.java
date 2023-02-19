package com.glyceryl6.cd.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class CDTabs {

    public static CreativeModeTab CD_TAB_0 = new CreativeModeTab("cd_tab_0") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.BEDROCK);
        }

    };

}