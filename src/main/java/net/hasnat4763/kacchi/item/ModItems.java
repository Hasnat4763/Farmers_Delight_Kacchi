package net.hasnat4763.kacchi.item;

import net.hasnat4763.kacchi.kacchi;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kacchi.MODID);
    public static final RegistryObject<Item>  KACCHI = ITEMS.register("kacchi",
            () -> new Item(new Item.Properties().food(ModFoods.KACCHI)));
    public static final RegistryObject<Item>  MASALA = ITEMS.register("masala",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  YOGURT = ITEMS.register("yogurt",
            () -> new Item(new Item.Properties().food(ModFoods.YOGURT)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
