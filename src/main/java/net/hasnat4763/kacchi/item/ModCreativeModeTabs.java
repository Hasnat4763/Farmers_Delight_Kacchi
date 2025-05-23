package net.hasnat4763.kacchi.item;

import net.hasnat4763.kacchi.kacchi;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, kacchi.MODID);

    public static final RegistryObject<CreativeModeTab> KACCHI_TAB = CREATIVE_MODE_TABS.register("farmers_delight_kacchi",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KACCHI.get()))
                    .title(Component.translatable("creativetab.kacchi_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KACCHI.get());
                        output.accept(ModItems.CHICKBIR.get());
                        output.accept(ModItems.MACHVAAT.get());
                        output.accept(ModItems.PANTAVAAT.get());
                        output.accept(ModItems.YOGURT.get());
                        output.accept(ModItems.MASALA.get());
                        output.accept(ModItems.CUP.get());
                        output.accept(ModItems.UNCOOKEDCUP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
