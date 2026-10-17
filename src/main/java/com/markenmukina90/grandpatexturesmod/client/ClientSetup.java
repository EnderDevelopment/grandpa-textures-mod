package com.markenmukina90.grandpatexturesmod.client;

import com.markenmukina90.grandpatexturesmod.client.model.GrandpaModel;
import com.markenmukina90.grandpatexturesmod.client.renderer.GrandpaRenderer;
import com.markenmukina90.grandpatexturesmod.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "grandpatexturesmod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityRegistry.GRANDPA.get(), GrandpaRenderer::new);
    }
}
