package blackwolf00.toolsofobdisian.init;

import blackwolf00.toolsofobdisian.tier.ArmorTier;
import blackwolf00.toolsofobdisian.tier.ItemTier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "toolsofobsidian");

    public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ItemTier.OBSIDIAN, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ItemTier.OBSIDIAN, 6.0f, -3.0f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ItemTier.OBSIDIAN, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ItemTier.OBSIDIAN, 0.0f, -3.0f, new Item.Properties()));
    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ItemTier.OBSIDIAN, -6, 0.0f, new Item.Properties()));
    public static final RegistryObject<BowItem> OBSIDIAN_BOW = ITEMS.register("obsidian_bow",
            () -> new BowItem(new Item.Properties().durability(800)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new ArmorItem(ArmorTier.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ArmorTier.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ArmorTier.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ArmorTier.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<HorseArmorItem> HORSE_ARMOR_OBSIDIAN = ITEMS.register("obsidian_horse_armor",
            () -> new HorseArmorItem(10, "obsidian", new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot",
            () -> new Item(new Item.Properties()));
}