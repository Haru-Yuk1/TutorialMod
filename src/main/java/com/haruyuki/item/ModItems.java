package com.haruyuki.item;

import com.haruyuki.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ICE_ETHER=registerItems("ice_ether",new Item(new Item.Settings())) ;

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id),item);

    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items");
    }

}
