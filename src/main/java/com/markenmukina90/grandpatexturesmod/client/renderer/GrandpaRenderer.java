package com.markenmukina90.grandpatexturesmod.client.renderer;

import com.markenmukina90.grandpatexturesmod.entity.GrandpaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GrandpaRenderer extends MobRenderer<GrandpaEntity, GrandpaModel<GrandpaEntity>> {
    public GrandpaRenderer(EntityRendererProvider.Context context) {
        super(context, new GrandpaModel<>(context.bakeLayer(GrandpaModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GrandpaEntity entity) {
        return new ResourceLocation("grandpatexturesmod:textures/entity/grandpa/normal.png");
    }
}
