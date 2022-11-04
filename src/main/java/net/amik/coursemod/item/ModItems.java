package net.amik.coursemod.item;

import net.amik.coursemod.CourseMod;
import net.amik.coursemod.item.custom.DowsingRodItem;
import net.amik.coursemod.item.custom.FireWoodItem;
import net.amik.coursemod.item.custom.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CourseMod.MOD_ID);

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).durability(12)));

    public static final RegistryObject<Item> FIREWOOD = ITEMS.register("firewood",
            () -> new FireWoodItem(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB).food(ModFoods.PANCAKE)));

    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword",
            () -> new SwordItem(ModTiers.TUNGSTEN, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModTiers.TUNGSTEN, 2, 0f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
            () -> new PickaxeItem(ModTiers.TUNGSTEN, 2, 1f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe",
            () -> new HoeItem(ModTiers.TUNGSTEN, 2, -1f, new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
