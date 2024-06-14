package moe.endlia.tofumod;

import moe.endlia.tofumod.block.ModBlocks;
import moe.endlia.tofumod.item.ModItemGroups;
import moe.endlia.tofumod.item.ModItems;
import moe.endlia.tofumod.util.ModLootableModifiers;
import net.fabricmc.api.ModInitializer;
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
		ModLootableModifiers.modifyLootables();
	}
}