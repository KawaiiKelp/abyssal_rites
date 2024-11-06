package net.kawaiikelp.abyssalrites.item;

import net.kawaiikelp.abyssalrites.AbyssalRites;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbyssalRites.MOD_ID);

    public static final RegistryObject<Item> DIAMANTE = ITEMS.register("diamante",
            () -> new Item(new Item.Properties())); // Diamante 아이템 등록
    public static final RegistryObject<Item> ABYSS_SHARD = ITEMS.register("abyss_shard",
            () -> new Item(new Item.Properties())); // Abyss Shard 아이템 등록

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
