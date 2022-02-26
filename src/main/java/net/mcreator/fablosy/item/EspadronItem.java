
package net.mcreator.fablosy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.fablosy.itemgroup.CustomItemGroup;
import net.mcreator.fablosy.FablosyModElements;

@FablosyModElements.ModElement.Tag
public class EspadronItem extends FablosyModElements.ModElement {
	@ObjectHolder("fablosy:espadron")
	public static final Item block = null;
	public EspadronItem(FablosyModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10.8f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(CustomItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("espadron"));
	}
}
