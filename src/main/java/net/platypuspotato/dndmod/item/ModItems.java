package net.platypuspotato.dndmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.platypuspotato.dndmod.DndMod;
import net.platypuspotato.dndmod.item.custom.MusicItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DndMod.MOD_ID);

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTINE = ITEMS.register("adamantine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_CRYSTAL = ITEMS.register("celestial_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOODBERRY = ITEMS.register("goodberry",
            () -> new Item(new Item.Properties().food(ModFoods.GOODBERRY)));
    public static final RegistryObject<Item> LUTE = ITEMS.register("lute",
            () -> new MusicItem(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
