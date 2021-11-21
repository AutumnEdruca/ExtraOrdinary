package com.autumn.extraordinary.item;

import com.autumn.extraordinary.ExtraOrdinary;
import com.autumn.extraordinary.item.custom.CrystalToolTier;
import com.autumn.extraordinary.item.custom.SoulTouchedStaffItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraOrdinary.MOD_ID);

    public static final RegistryObject<Item> TEAL_INGOT = ITEMS.register("teal_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> CRYSTAL_STICK = ITEMS.register("crystal_stick",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> CRYSTAL_PICKAXE = ITEMS.register("crystal_pickaxe",
            () -> new PickaxeItem(CrystalToolTier.CRYSTAL,2,1,
                    new Item.Properties().durability(10).tab(ModCreativeModeTab.ExtraOrdinary)));

    public static final RegistryObject<Item> ZOMBIE_HEART = ITEMS.register("zombie_heart",
            ()-> new Item(new Item.Properties().food(ModFoods.ZOMBIE_HEART).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> COOKED_ZOMBIE_HEART = ITEMS.register("cooked_zombie_heart",
            ()-> new Item(new Item.Properties().food(ModFoods.COOKED_ZOMBIE_HEART).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> HEART_JAR = ITEMS.register("heart_jar",
            ()-> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> GLASS_JAR = ITEMS.register("glass_jar",
            ()-> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> CLAY_HEART_JAR = ITEMS.register("clay_jar",
            ()-> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.ExtraOrdinary)));
    public static final RegistryObject<Item> SPECIAL_CLAY = ITEMS.register("special_clay",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ExtraOrdinary)));







    public static final RegistryObject<Item> SOUL_STAFF = ITEMS.register("soul_staff",
            ()-> new SoulTouchedStaffItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.ExtraOrdinary)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
