
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
public class AcciaioAsciaGuerraItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:acciaio_ascia_guerra")
	public static final Item block = null;
	public AcciaioAsciaGuerraItem(ZeiyocraftModElements instance) {
		super(instance, 285);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AcciaioLingottoItem.block));
			}
		}, 1, -2.9f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("acciaio_ascia_guerra"));
	}
}
