package net.mcreator.fablosy.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

import net.mcreator.fablosy.FablosyModElements;
import net.mcreator.fablosy.FablosyMod;

import java.util.Map;

@FablosyModElements.ModElement.Tag
public class OnsenbaslescouilesRightClickedInAirProcedure extends FablosyModElements.ModElement {
	public OnsenbaslescouilesRightClickedInAirProcedure(FablosyModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FablosyMod.LOGGER.warn("Failed to load dependency x for procedure OnsenbaslescouilesRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FablosyMod.LOGGER.warn("Failed to load dependency y for procedure OnsenbaslescouilesRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FablosyMod.LOGGER.warn("Failed to load dependency z for procedure OnsenbaslescouilesRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FablosyMod.LOGGER.warn("Failed to load dependency world for procedure OnsenbaslescouilesRightClickedInAir!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fablosy:onsenbaslescouillesmusic")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fablosy:onsenbaslescouillesmusic")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
