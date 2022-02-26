
package net.mcreator.fablosy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.fablosy.procedures.OnsenbaslescouilesRightClickedInAirProcedure;
import net.mcreator.fablosy.itemgroup.CustomItemGroup;
import net.mcreator.fablosy.FablosyModElements;

import java.util.Map;
import java.util.HashMap;

@FablosyModElements.ModElement.Tag
public class OnsenbaslescouilesItem extends FablosyModElements.ModElement {
	@ObjectHolder("fablosy:onsenbaslescouiles")
	public static final Item block = null;
	public OnsenbaslescouilesItem(FablosyModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FablosyModElements.sounds.get(new ResourceLocation("fablosy:onsenbaslescouillesmusic")),
					new Item.Properties().group(CustomItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("onsenbaslescouiles");
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				OnsenbaslescouilesRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
