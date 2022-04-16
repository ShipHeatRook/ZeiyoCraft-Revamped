
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
public class UvaItemItem extends ZeiyocraftModElements.ModElement {
	@ObjectHolder("zeiyocraft:uva_item")
	public static final Item block = null;
	public UvaItemItem(ZeiyocraftModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.2f).build()));
			setRegistryName("uva_item");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
