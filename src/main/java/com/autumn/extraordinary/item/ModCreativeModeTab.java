package com.autumn.extraordinary.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ExtraOrdinary = new CreativeModeTab("extraordinaryModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEAL_INGOT.get());
        }
    };
}
