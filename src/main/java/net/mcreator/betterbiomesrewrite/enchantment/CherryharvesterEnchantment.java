
package net.mcreator.betterbiomesrewrite.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.betterbiomesrewrite.BetterbiomesrewriteModElements;

@BetterbiomesrewriteModElements.ModElement.Tag
public class CherryharvesterEnchantment extends BetterbiomesrewriteModElements.ModElement {
	@ObjectHolder("betterbiomesrewrite:cherryharvester")
	public static final Enchantment enchantment = null;
	public CherryharvesterEnchantment(BetterbiomesrewriteModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("cherryharvester"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.COMMON, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 14;
		}

		@Override
		public int getMaxLevel() {
			return 30;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(Items.WOODEN_HOE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.STONE_HOE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_HOE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_HOE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_HOE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_HOE, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
