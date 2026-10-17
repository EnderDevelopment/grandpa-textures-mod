package com.markenmukina90.grandpatexturesmod.registry;

import com.markenmukina90.grandpatexturesmod.entity.GrandpaEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "grandpatexturesmod");

    public static final RegistryObject<EntityType<GrandpaEntity>> GRANDPA = ENTITY_TYPES.register("grandpa", () -> EntityType.Builder.of(GrandpaEntity::new, MobCategory.MONSTER).sized(0.5f, 0.5f).build("grandpa"));
}
