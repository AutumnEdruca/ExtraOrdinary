package com.autumn.extraordinary.item.custom;

import com.autumn.extraordinary.block.ModBlocks;
import com.autumn.extraordinary.item.ModItems;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class SoulTouchedStaffItem extends Item {
    private static final Map<Block, Item> SOULTOUCHED_STAFF_CRAFT =
            new ImmutableMap.Builder<Block, Item>()
                    .put(ModBlocks.PIP_BRICKS.get(), ModItems.TEAL_INGOT.get())
                    .put(Blocks.IRON_ORE, Items.IRON_INGOT.asItem())
                    .build();



    public SoulTouchedStaffItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos positionClicked = pContext.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if(canSoulTouch(blockClicked))  {
                ItemEntity entityItem = new ItemEntity(level,
                        positionClicked.getX(), positionClicked.getY(),positionClicked.getZ(),
                        new ItemStack(SOULTOUCHED_STAFF_CRAFT.get(blockClicked),1));


                        level.destroyBlock(positionClicked, false);
                        level.addFreshEntity(entityItem);
                        pContext.getItemInHand().hurtAndBreak(1,pContext.getPlayer(), p ->{
                            p.broadcastBreakEvent(pContext.getHand());
                        });
            } else {

                pContext.getPlayer().sendMessage(new TextComponent("No soul conductivity..."),
                        Util.NIL_UUID);
            }




        }

        return InteractionResult.SUCCESS;
    }

    private boolean canSoulTouch(Block block){
        return SOULTOUCHED_STAFF_CRAFT.containsKey(block);
    }
}
