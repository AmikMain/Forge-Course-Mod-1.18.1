package net.amik.coursemod.block.entity;

import net.amik.coursemod.CourseMod;
import net.amik.coursemod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CourseMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<TungstenBlasterBlockEntity>> TUNGSTEN_BLASTER =
            BLOCK_ENTITIES.register("cobalt_blaster", () ->
                    BlockEntityType.Builder.of(TungstenBlasterBlockEntity::new, ModBlocks.TUNGSTEN_BLASTER.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
