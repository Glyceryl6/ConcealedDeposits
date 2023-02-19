package com.glyceryl6.cd.data.provider.lang;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.data.LanguageProvider;

public class CDLanguageProviderZHCN extends LanguageProvider {

    public CDLanguageProviderZHCN(DataGenerator generator) {
        super(generator, ConcealedDeposits.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {

    }

    public void addCreativeTab(CreativeModeTab tab, String value) {
        this.add("itemGroup." + tab.langId, value);
    }

}