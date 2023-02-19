package com.glyceryl6.cd.data.provider;

import com.glyceryl6.cd.ConcealedDeposits;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class CDBlockTagsProvider extends BlockTagsProvider {

    public CDBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, ConcealedDeposits.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }

}