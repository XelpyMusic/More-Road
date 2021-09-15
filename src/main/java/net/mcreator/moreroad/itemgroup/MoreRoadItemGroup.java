
package net.mcreator.moreroad.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreroad.block.A1aBlock;
import net.mcreator.moreroad.MoreRoadModElements;

@MoreRoadModElements.ModElement.Tag
public class MoreRoadItemGroup extends MoreRoadModElements.ModElement {
	public MoreRoadItemGroup(MoreRoadModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_road") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(A1aBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
