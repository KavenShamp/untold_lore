
package net.mcreator.untoldlore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RavagerHornItem extends Item {
	public RavagerHornItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
