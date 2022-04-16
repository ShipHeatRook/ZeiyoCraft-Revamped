
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
public class ElectrumAsciaGuerraItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:electrum_ascia_guerra")
	public static final Item block = null;
	public ElectrumAsciaGuerraItem(ZeiyocraftModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 700;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ElectrumLingottoItem.block));
			}
		}, 1, -2.9f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("electrum_ascia_guerra"));
	}
}
