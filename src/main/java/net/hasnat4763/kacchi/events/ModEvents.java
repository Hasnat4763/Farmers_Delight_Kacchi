package net.hasnat4763.kacchi.events;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.hasnat4763.kacchi.item.ModItems;
import net.hasnat4763.kacchi.kacchi;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = kacchi.MODID)

public class ModEvents {
    @SubscribeEvent
    public static void customtrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.FARMER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.MASALA.get(), 1),
                    10, 8, 1f));
        }
        if(event.getType() == VillagerProfession.BUTCHER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(ModItems.KACCHI.get(), 1),
                    10, 8, 1f));
        }
    }
}
