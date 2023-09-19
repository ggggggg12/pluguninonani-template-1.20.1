package net.qw09.pluguninonani;

import net.fabricmc.api.ModInitializer;

import net.qw09.pluguninonani.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pluguninonani implements ModInitializer {
	public static final String MOD_ID = "pluguninonani";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.RegisterModItems();

		LOGGER.info("yeah i get it");
	}
}