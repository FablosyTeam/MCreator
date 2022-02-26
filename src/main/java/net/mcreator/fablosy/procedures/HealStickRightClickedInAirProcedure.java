package net.mcreator.fablosy.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fablosy.item.HealStickItem;
import net.mcreator.fablosy.FablosyModElements;
import net.mcreator.fablosy.FablosyMod;

import java.util.Map;

@FablosyModElements.ModElement.Tag
public class HealStickRightClickedInAirProcedure extends FablosyModElements.ModElement {
	public HealStickRightClickedInAirProcedure(FablosyModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FablosyMod.LOGGER.warn("Failed to load dependency entity for procedure HealStickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(HealStickItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
