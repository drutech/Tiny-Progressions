package com.kashdeya.tinyprogressions.events;

import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class BucketUseEvent {
    @SubscribeEvent
    public static void onBucketUse(FillBucketEvent event)
    {
        if (event.getTarget() != null)
        {
            if (event.getTarget().typeOfHit == RayTraceResult.Type.BLOCK)
            {
                if (event.getWorld().getBlockState(event.getTarget().getBlockPos()).getBlock() == TechBlocks.growth_upgrade)
                {
                    event.setCanceled(true);
                }
            }
        }
    }
    
    @SubscribeEvent
    public static void onBucket(FillBucketEvent event)
    {
        if (event.getTarget() != null)
        {
            if (event.getTarget().typeOfHit == RayTraceResult.Type.BLOCK)
            {
                if (event.getWorld().getBlockState(event.getTarget().getBlockPos()).getBlock() == TechBlocks.growth_upgrade_two)
                {
                    event.setCanceled(true);
                }
            }
        }
    }
}
