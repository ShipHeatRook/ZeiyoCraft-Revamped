
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
public class GiadaZappaItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:giada_zappa")
	public static final Item block = null;
	public GiadaZappaItem(ZeiyocraftModElements instance) {
		super(instance, 311);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(GiadaItem.block));
			}
		}, 0, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("giada_zappa"));
	}
}
