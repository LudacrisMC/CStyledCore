package dev.downloadablefox.contentstyled;

import dev.downloadablefox.contentstyled.commands.DebugCommand;
import dev.downloadablefox.contentstyled.events.PlayerJoinEvent;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.command.api.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContentStyled implements ModInitializer {
	public static final String MOD_ID = "contentstyled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		registerEvents();
		registerCommands();
	}

	public void registerCommands() {
		CommandRegistrationCallback.EVENT.register((dispatcher, context, environment) -> {
			DebugCommand.register(dispatcher);
		});
	}

	public void registerEvents() {
		PlayerJoinEvent.register();
	}
}
