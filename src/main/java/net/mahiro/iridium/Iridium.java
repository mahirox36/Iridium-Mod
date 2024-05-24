package net.mahiro.iridium;

import net.fabricmc.api.ModInitializer;

import net.mahiro.iridium.block.ModBlocks;
import net.mahiro.iridium.item.ModItemGroups;
import net.mahiro.iridium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Iridium implements ModInitializer {
	public static final String MOD_ID = "iridium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Initialize for "+ MOD_ID);
		ModItemGroups.registerItemsGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}