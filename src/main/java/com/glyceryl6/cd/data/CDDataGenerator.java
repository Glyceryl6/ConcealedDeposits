package com.glyceryl6.cd.data;

import com.glyceryl6.cd.ConcealedDeposits;
import com.glyceryl6.cd.data.provider.*;
import com.glyceryl6.cd.data.provider.lang.CDLanguageProviderENUS;
import com.glyceryl6.cd.data.provider.lang.CDLanguageProviderZHCN;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ConcealedDeposits.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CDDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeServer(), new CDBlockStateProvider(generator, exFileHelper));
        generator.addProvider(event.includeServer(), new CDItemModelProvider(generator, exFileHelper));
        CDBlockTagsProvider blockTagsProvider = new CDBlockTagsProvider(generator, exFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new CDItemTagsProvider(generator, blockTagsProvider, exFileHelper));
        generator.addProvider(event.includeServer(), new CDItemModelProvider(generator, exFileHelper));
        generator.addProvider(event.includeServer(), new CDLanguageProviderENUS(generator));
        generator.addProvider(event.includeServer(), new CDLanguageProviderZHCN(generator));
        generator.addProvider(event.includeServer(), new CDLootTableProvider(generator));
        generator.addProvider(event.includeServer(), new CDRecipeProvider(generator));
    }

}