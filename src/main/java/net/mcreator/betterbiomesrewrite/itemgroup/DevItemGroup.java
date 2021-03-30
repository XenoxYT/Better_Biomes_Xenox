
package net.mcreator.betterbiomesrewrite.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.betterbiomesrewrite.block.SakuraLeavesBlock;
import net.mcreator.betterbiomesrewrite.BetterbiomesrewriteModElements;

@BetterbiomesrewriteModElements.ModElement.Tag
public class DevItemGroup extends BetterbiomesrewriteModElements.ModElement {
	public DevItemGroup(BetterbiomesrewriteModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdev") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SakuraLeavesBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
