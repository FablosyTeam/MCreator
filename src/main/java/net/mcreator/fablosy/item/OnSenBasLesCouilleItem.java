
package net.mcreator.fablosy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.fablosy.itemgroup.CustomItemGroup;
import net.mcreator.fablosy.FablosyModElements;

@FablosyModElements.ModElement.Tag
public class OnSenBasLesCouilleItem extends FablosyModElements.ModElement {
	@ObjectHolder("fablosy:on_sen_bas_les_couille")
	public static final Item block = null;
	public OnSenBasLesCouilleItem(FablosyModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FablosyModElements.sounds.get(new ResourceLocation("fablosy:custommusicdisc")),
					new Item.Properties().group(CustomItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("on_sen_bas_les_couille");
		}
	}
}
