
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
public class AmetistaAsciaGuerraItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:ametista_ascia_guerra")
	public static final Item block = null;
	public AmetistaAsciaGuerraItem(ZeiyocraftModElements instance) {
		super(instance, 26);
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
				return Ingredient.fromStacks(new ItemStack(AmetistaItem.block));
			}
		}, 1, -2.9000000000000001f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("ametista_ascia_guerra"));
	}
}
