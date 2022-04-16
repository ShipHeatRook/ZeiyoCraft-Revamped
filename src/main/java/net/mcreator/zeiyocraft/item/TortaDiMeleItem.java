
package net.mcreator.zeiyocraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.zeiyocraft.ZeiyocraftModElements;

@ZeiyocraftModElements.ModElement.Tag
public class TortaDiMeleItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:torta_di_mele")
	public static final Item block = null;
	public TortaDiMeleItem(ZeiyocraftModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(8).saturation(0.6f).build()));
			setRegistryName("torta_di_mele");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
