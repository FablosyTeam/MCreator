package net.mcreator.fablosy.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fablosy.item.FoodStickItem;
import net.mcreator.fablosy.FablosyModElements;
import net.mcreator.fablosy.FablosyMod;

import java.util.Map;

@FablosyModElements.ModElement.Tag
public class FoodStickRightClickedInAirProcedure extends FablosyModElements.ModElement {
	public FoodStickRightClickedInAirProcedure(FablosyModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FablosyMod.LOGGER.warn("Failed to load dependency entity for procedure FoodStickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 10);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(FoodStickItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
