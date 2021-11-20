package com.autumn.extraordinary.block;

import com.autumn.extraordinary.ExtraOrdinary;
import com.autumn.extraordinary.item.ModCreativeModeTab;
import com.autumn.extraordinary.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraOrdinary.MOD_ID);

    public static final RegistryObject<Block> PIP_BRICKS = registerBlock("pip_bricks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(12f)));
    public static final RegistryObject<Block> HUSK_CROP = registerBlock("husk_crop",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.WHEAT).instabreak().noCollission().sound(SoundType.CROP)));







    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.ExtraOrdinary)));
    }





    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


}
