package com.markenmukina90.grandpatexturesmod;

import com.markenmukina90.grandpatexturesmod.registry.EntityRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = "grandpatexturesmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        EntityRegistry.ENTITY_TYPES.register(event.getModEventBus());
    }
}
