package net.mcreator.fablosy.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fablosy.FablosyModElements;
import net.mcreator.fablosy.FablosyMod;

import java.util.Map;
import java.util.Collections;

@FablosyModElements.ModElement.Tag
public class SpawnCommandExecutedProcedure extends FablosyModElements.ModElement {
	public SpawnCommandExecutedProcedure(FablosyModElements instance) {
		super(instance, 21);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FablosyMod.LOGGER.warn("Failed to load dependency entity for procedure SpawnCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FablosyMod.LOGGER.warn("Failed to load dependency x for procedure SpawnCommandExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FablosyMod.LOGGER.warn("Failed to load dependency y for procedure SpawnCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FablosyMod.LOGGER.warn("Failed to load dependency z for procedure SpawnCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(x, y, z);
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, z, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
