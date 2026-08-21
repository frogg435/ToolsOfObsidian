package blackwolf00.toolsofobdisian.tier;

import blackwolf00.toolsofobdisian.init.ItemInit;
import java.util.function.Supplier;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ItemTier implements Tier {
    OBSIDIAN(4, 2500, 12.0f, 6.0f, 16, () -> Ingredient.of(ItemInit.OBSIDIAN_INGOT.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    private ItemTier(int harvestLevelIn, int durabilityIn, float speedIn, float damageIn, int enchantIn,
                     Supplier<Ingredient> repairIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = durabilityIn;
        this.efficiency = speedIn;
        this.attackDamage = damageIn;
        this.enchantability = enchantIn;
        this.repairMaterial = new LazyLoadedValue<>(repairIn);
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}