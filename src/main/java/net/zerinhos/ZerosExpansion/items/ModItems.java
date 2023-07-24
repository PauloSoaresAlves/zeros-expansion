package net.zerinhos.ZerosExpansion.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zerinhos.ZerosExpansion.ZerosExpansion;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZerosExpansion.MOD_ID);

    public static final RegistryObject<Item> JELLY_BALL = ITEMS.register("jellyball",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
