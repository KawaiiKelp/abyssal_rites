package net.kawaiikelp.abyssalrites.item;

import net.kawaiikelp.abyssalrites.AbyssalRites;
import net.kawaiikelp.abyssalrites.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbyssalRites.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ABYSSAL_RITES = CREATIVE_MODE_TABS.register("abyssal_rites",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABYSS_SHARD.get()))
                    .title(Component.translatable("creativetab.abyssal_rites"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DIAMANTE.get()); // Abyssal Rites 탭에 Diamante 아이템 등록
                        pOutput.accept(ModItems.ABYSS_SHARD.get()); // Abyssal Rites 탭에 Abyss Shard 아이템 추가

                        pOutput.accept(ModBlocks.ABYSS_BLOCK.get()); // Abyssal Rites 탭에 Abyss Block 블록 추가
                    })
                    .build()); // Abyssal Rites 탭 등록

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
