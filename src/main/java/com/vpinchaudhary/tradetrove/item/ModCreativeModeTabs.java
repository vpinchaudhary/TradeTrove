package com.vpinchaudhary.tradetrove.item;

import com.vpinchaudhary.tradetrove.TradeTrove;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TradeTrove.MODID);

    public static final RegistryObject<CreativeModeTab> TRADE_TAB = CREATIVE_MODE_TABS.register("trade_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_COIN.get()))
                    .title(Component.translatable("creativetab.trade_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.COPPER_COIN.get());
                        output.accept(ModItems.IRON_COIN.get());
                        output.accept(ModItems.GOLD_COIN.get());
                        output.accept(ModItems.DIAMOND_COIN.get());
                        output.accept(ModItems.NETHER_COIN.get());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
