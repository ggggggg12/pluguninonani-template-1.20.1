package net.qw09.pluguninonani;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pluguninonani implements ModInitializer {
	public static final String MOD_ID = "pluguninonani";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("yeah i get it");
	}
}