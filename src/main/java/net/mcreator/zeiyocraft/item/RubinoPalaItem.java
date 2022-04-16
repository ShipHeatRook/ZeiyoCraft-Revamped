
package net.mcreator.zeiyocraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.zeiyocraft.ZeiyocraftModElements;

@ZeiyocraftModElements.ModElement.Tag
public class RubinoPalaItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:rubino_pala")
	public static final Item block = null;
	public RubinoPalaItem(ZeiyocraftModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2656;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubinoItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("rubino_pala"));
	}
}
