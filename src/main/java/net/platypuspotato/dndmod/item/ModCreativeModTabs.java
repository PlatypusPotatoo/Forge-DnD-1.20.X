package net.platypuspotato.dndmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.platypuspotato.dndmod.DndMod;
import net.platypuspotato.dndmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DndMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> DND_TAB = CREATIVE_MODE_TABS.register("dnd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_ADAMANTINE.get()))
                    .title(Component.translatable("creativetab.dnd_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //Items
                        pOutput.accept(ModItems.ADAMANTINE.get());
                        pOutput.accept(ModItems.RAW_ADAMANTINE.get());
                        pOutput.accept(ModItems.STEEL.get());
                        pOutput.accept(ModItems.CELESTIAL_CRYSTAL.get());

                        //Blocks
                        pOutput.accept(ModBlocks.ADAMANTINE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ADAMANTINE_ORE.get());
                        pOutput.accept(ModBlocks.ADAMANTINE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_ADAMANTINE_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK1.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
