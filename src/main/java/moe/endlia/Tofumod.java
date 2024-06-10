package moe.endlia;

import moe.endlia.block.ModBlocks;
import moe.endlia.item.ModItemGroups;
import moe.endlia.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tofumod implements ModInitializer {

	public static final String MOD_ID = "tofumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {

		LOGGER.info("Tofumod initialing");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}