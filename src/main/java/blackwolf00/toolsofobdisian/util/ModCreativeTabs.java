package blackwolf00.toolsofobdisian.util;

import blackwolf00.toolsofobdisian.init.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, "toolsofobsidian");

    public static final RegistryObject<CreativeModeTab> MOD_TAB = REGISTRY.register("creative_mode_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemInit.OBSIDIAN_SWORD.get()))
                    .title(Component.literal("Elemental Swords"))
                    .displayItems((params, output) -> {
                        output.accept(ItemInit.OBSIDIAN_SWORD.get());
                        output.accept(ItemInit.OBSIDIAN_AXE.get());
                        output.accept(ItemInit.OBSIDIAN_PICKAXE.get());
                        output.accept(ItemInit.OBSIDIAN_SHOVEL.get());
                        output.accept(ItemInit.OBSIDIAN_HOE.get());
                        output.accept(ItemInit.OBSIDIAN_BOW.get());
                        output.accept(ItemInit.OBSIDIAN_HELMET.get());
                        output.accept(ItemInit.OBSIDIAN_CHESTPLATE.get());
                        output.accept(ItemInit.OBSIDIAN_LEGGINGS.get());
                        output.accept(ItemInit.OBSIDIAN_BOOTS.get());
                        output.accept(ItemInit.OBSIDIAN_INGOT.get());
                        output.accept(ItemInit.HORSE_ARMOR_OBSIDIAN.get());
                    })
                    .build());
}