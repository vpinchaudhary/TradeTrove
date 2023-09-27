package com.vpinchaudhary.tradetrove;

import com.vpinchaudhary.tradetrove.item.ModCreativeModeTabs;
import com.vpinchaudhary.tradetrove.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TradeTrove.MODID)
public class TradeTrove
{
    public static final String MODID = "tradetrove";

    public TradeTrove() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {});
    }
}