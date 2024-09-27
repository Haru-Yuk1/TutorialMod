package com.haruyuki.item;

import com.haruyuki.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.haruyuki.TutorialMod.MOD_ID;

public class ModItemGroups {
    public static final ItemGroup TUTORIAL_GROUP= Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID,"tutorial_group"),
            ItemGroup.create(null,-1)
                    .displayName(Text.translatable("itemGroup.tutorial_group"))
                    .icon(()-> new ItemStack(ModItems.ICE_ETHER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ICE_ETHER);
                    })
                    .build());

    public static void registerModItemGroups(){
        TutorialMod.LOGGER.info("Registering ModItemGroups");
    }
}
