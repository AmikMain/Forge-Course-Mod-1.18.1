package net.amik.coursemod.block;

import net.amik.coursemod.CourseMod;
import net.amik.coursemod.block.custom.*;
import net.amik.coursemod.item.ModCreativeModeTab;
import net.amik.coursemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CourseMod.MOD_ID);

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_STAIRS = registerBlock("tungsten_stairs",
            () -> new StairBlock(() -> ModBlocks.TUNGSTEN_BLOCK.get().defaultBlockState(), //?????? ?????????? ?????????? ?????????????????? ???????? ?????????????? ???? ?????????? ??????????????????.
                    BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_SLAB = registerBlock("tungsten_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_BUTTON = registerBlock("tungsten_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_PRESSURE_PLATE = registerBlock("tungsten_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_FENCE = registerBlock("tungsten_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_FENCE_GATE = registerBlock("tungsten_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_WALL = registerBlock("tungsten_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_DOOR = registerBlock("tungsten_door",
            () -> new SemiDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_TRAPDOOR = registerBlock("tungsten_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> TUNGSTEN_LAMP = registerBlock("tungsten_lamp",
            () -> new TungstenLampBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().lightLevel((state) -> state.getValue(TungstenLampBlock.CLICKED) ? 15 : 0)), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> PANCAKE_CROP = BLOCKS.register("pancake_crop",
            () -> new PancakeCropBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)
                    .requiresCorrectToolForDrops().noCollission().noOcclusion()));


    public static final RegistryObject<Block> TUNGSTEN_BLASTER = registerBlock("tungsten_blaster",
            () -> new TungstenBlasterBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.COURSE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn =  BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                 new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
