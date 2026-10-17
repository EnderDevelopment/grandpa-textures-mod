package com.markenmukina90.grandpatexturesmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("grandpatexturesmod")
public class GrandpaTexturesMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public GrandpaTexturesMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Grandpa Textures Mod is setting up.");
    }
}
