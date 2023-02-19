package com.glyceryl6.cd.data.provider;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CDItemModelProvider extends ItemModelProvider {

    public CDItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ConcealedDeposits.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

}