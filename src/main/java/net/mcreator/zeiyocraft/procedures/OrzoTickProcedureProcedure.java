package net.mcreator.zeiyocraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.zeiyocraft.block.OrzoStage7Block;
import net.mcreator.zeiyocraft.block.OrzoStage6Block;
import net.mcreator.zeiyocraft.block.OrzoStage5Block;
import net.mcreator.zeiyocraft.block.OrzoStage4Block;
import net.mcreator.zeiyocraft.block.OrzoStage3Block;
import net.mcreator.zeiyocraft.block.OrzoStage2Block;
import net.mcreator.zeiyocraft.block.OrzoStage1Block;
import net.mcreator.zeiyocraft.block.OrzoStage0Block;
import net.mcreator.zeiyocraft.ZeiyocraftMod;

import java.util.Map;

public class OrzoTickProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency x for procedure OrzoTickProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency y for procedure OrzoTickProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency z for procedure OrzoTickProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZeiyocraftMod.LOGGER.warn("Failed to load dependency world for procedure OrzoTickProcedure!");
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
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage0Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage1Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage0Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage1Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage1Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage2Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage1Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage2Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage2Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage3Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage2Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage3Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage3Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage4Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage3Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage4Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage4Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage5Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage4Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage5Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage5Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage6Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage5Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage6Block.block.getDefaultState(), 3);
			}
		} else if ((((world instanceof World) ? ((World) world).isDaytime() : false)
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage6Block.block)))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage7Block.block.getDefaultState(), 3);
			}
		} else if (((!((world instanceof World) ? ((World) world).isDaytime() : false))
				&& (((world.getLight(new BlockPos((int) x, (int) y, (int) z))) >= 9)
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OrzoStage6Block.block))))) {
			if ((LocalRandomNumber <= 50)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), OrzoStage7Block.block.getDefaultState(), 3);
			}
		}
	}
}
