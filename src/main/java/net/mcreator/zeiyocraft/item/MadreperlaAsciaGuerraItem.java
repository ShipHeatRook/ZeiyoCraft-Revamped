
package net.mcreator.zeiyocraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.zeiyocraft.ZeiyocraftModElements;

@ZeiyocraftModElements.ModElement.Tag
public class MadreperlaAsciaGuerraItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:madreperla_ascia_guerra")
	public static final Item block = null;
	public MadreperlaAsciaGuerraItem(ZeiyocraftModElements instance) {
		super(instance, 333);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2656;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MadreperlaItem.block));
			}
		}, 1, -2.9f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("madreperla_ascia_guerra"));
	}
}