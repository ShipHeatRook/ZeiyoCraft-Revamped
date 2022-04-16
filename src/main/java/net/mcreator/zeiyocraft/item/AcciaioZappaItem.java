
package net.mcreator.zeiyocraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.zeiyocraft.ZeiyocraftModElements;

@ZeiyocraftModElements.ModElement.Tag
public class AcciaioZappaItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:acciaio_zappa")
	public static final Item block = null;
	public AcciaioZappaItem(ZeiyocraftModElements instance) {
		super(instance, 286);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AcciaioLingottoItem.block));
			}
		}, 0, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("acciaio_zappa"));
	}
}
