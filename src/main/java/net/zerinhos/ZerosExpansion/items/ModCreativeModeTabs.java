package net.zerinhos.ZerosExpansion.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zerinhos.ZerosExpansion.ZerosExpansion;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZerosExpansion.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZEROS_EXPANSION_TAB =
            CREATIVE_MODE_TABS.register("zeros_expansion_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.JELLY_BALL.get()))
                    .title(Component.translatable("creativetab.zeros_expansion_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.JELLY_BALL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
