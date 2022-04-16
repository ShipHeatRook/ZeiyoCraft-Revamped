package net.mcreator.zeiyocraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.zeiyocraft.block.PeperoncinoStage4Block;
import net.mcreator.zeiyocraft.block.PeperoncinoStage3Block;
import net.mcreator.zeiyocraft.block.PeperoncinoStage2Block;
import net.mcreator.zeiyocraft.block.PeperoncinoStage1Block;
import net.mcreator.zeiyocraft.block.PeperoncinoStage0Block;
import net.mcreator.zeiyocraft.ZeiyocraftMod;

import java.util.Map;

public class PeperoncinoTickProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency x for procedure PeperoncinoTickProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency y for procedure PeperoncinoTickProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency z for procedure PeperoncinoTickProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency world for procedure PeperoncinoTickProcedure!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double LocalRandomNumber = 0;
		LocalRandomNumber = (double) (Math.random() * 100);
		if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage0Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage1Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage0Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage1Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage1Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage2Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage1Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage2Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage2Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage3Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage2Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage3Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage3Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage4Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PeperoncinoStage3Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PeperoncinoStage4Block.block.getDefaultState(), 3);
			}
		}
	}
}
