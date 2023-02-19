package com.glyceryl6.cd;

import com.glyceryl6.cd.registry.CDBlocks;
import com.glyceryl6.cd.registry.CDEntities;
import com.glyceryl6.cd.registry.CDItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Locale;

@Mod(ConcealedDeposits.MOD_ID)
public class ConcealedDeposits {

    public static final String MOD_ID = "concealed_deposits";
    public IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public ConcealedDeposits() {
        CDItems.ITEMS.register(this.eventBus);
        CDBlocks.BLOCKS.register(this.eventBus);
        CDEntities.ENTITY_TYPES.register(this.eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}