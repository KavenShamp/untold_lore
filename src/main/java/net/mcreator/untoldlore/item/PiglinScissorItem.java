
package net.mcreator.untoldlore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class PiglinScissorItem extends AxeItem {
	public PiglinScissorItem() {
		super(new Tier() {
			public int getUses() {
				return 854;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
