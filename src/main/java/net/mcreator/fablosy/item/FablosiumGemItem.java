
package net.mcreator.fablosy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fablosy.itemgroup.CustomItemGroup;
import net.mcreator.fablosy.FablosyModElements;

@FablosyModElements.ModElement.Tag
public class FablosiumGemItem extends FablosyModElements.ModElement {
	@ObjectHolder("fablosy:fablosium_gem")
	public static final Item block = null;
	public FablosiumGemItem(FablosyModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CustomItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("fablosium_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
