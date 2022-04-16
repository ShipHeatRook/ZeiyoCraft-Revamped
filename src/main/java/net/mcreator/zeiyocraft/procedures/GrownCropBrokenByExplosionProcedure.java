package net.mcreator.zeiyocraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.zeiyocraft.item.CanapaSemiItem;
import net.mcreator.zeiyocraft.item.CanapaItemItem;
import net.mcreator.zeiyocraft.ZeiyocraftMod;

import java.util.Map;

public class GrownCropBrokenByExplosionProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency x for procedure GrownCropBrokenByExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency y for procedure GrownCropBrokenByExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency z for procedure GrownCropBrokenByExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency world for procedure GrownCropBrokenByExplosion!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double dropChance = 0;
		dropChance = (double) Math.random();
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(CanapaItemItem.block));
			entityToSpawn.setPickupDelay((int) 5);
			world.addEntity(entityToSpawn);
		}
		if ((dropChance >= 0.813)) {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(CanapaSemiItem.block));
					entityToSpawn.setPickupDelay((int) 5);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((dropChance >= 0.471)) {
			for (int index1 = 0; index1 < (int) (2); index1++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(CanapaSemiItem.block));
					entityToSpawn.setPickupDelay((int) 5);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((dropChance >= 0.323)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(CanapaSemiItem.block));
				entityToSpawn.setPickupDelay((int) 5);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
