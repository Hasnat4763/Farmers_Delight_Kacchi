package net.hasnat4763.kacchi;

import com.mojang.logging.LogUtils;
import net.hasnat4763.kacchi.item.ModCreativeModeTabs;
import net.hasnat4763.kacchi.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(kacchi.MODID)
public class kacchi {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "kacchi";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public kacchi(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.KACCHI);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.MASALA);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.YOGURT);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.CHICKBIR);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.MACHVAAT);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.PANTAVAAT);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.CUP);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.UNCOOKEDCUP);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
