package net.platypuspotato.dndmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.decoration.LeashFenceKnotEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;

public class MusicItem extends Item {
    public MusicItem(Item.Properties pProperties) {
        super(pProperties);
    }
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        BlockPos pPos = pPlayer.getOnPos();
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        boolean flag = false;
        double d0 = 7.0D;
        int i = pPos.getX();
        int j = pPos.getY();
        int k = pPos.getZ();
        pPlayer.sendSystemMessage(Component.literal("bind"));
        for(Mob mob : pLevel.getEntitiesOfClass(Mob.class, new AABB((double)i - 7.0D, (double)j - 7.0D, (double)k - 7.0D, (double)i + 7.0D, (double)j + 7.0D, (double)k + 7.0D))) {
            pPlayer.sendSystemMessage(Component.literal("found"));
            mob.setLeashedTo(pPlayer, true);
            flag = true;
            pPlayer.sendSystemMessage(Component.literal("leashed"));
        }


        if (flag) {
            pLevel.gameEvent(GameEvent.BLOCK_ATTACH, pPos, GameEvent.Context.of(pPlayer));
            pPlayer.sendSystemMessage(Component.literal("flag check"));
        }
        if(flag)
            return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));

        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));

    }

}
