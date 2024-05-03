package smm.shadowfall;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadowfallAdditions implements ModInitializer {
	public static final String MOD_ID = "shadowfall-additions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Shadowfall!");
	}
}