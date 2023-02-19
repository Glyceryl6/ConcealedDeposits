package com.glyceryl6.cd.data.provider;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CDBlockStateProvider extends BlockStateProvider {

    public CDBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ConcealedDeposits.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

}