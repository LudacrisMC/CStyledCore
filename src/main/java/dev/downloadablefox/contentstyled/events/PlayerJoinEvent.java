package dev.downloadablefox.contentstyled.events;

import net.minecraft.text.Text;
import org.quiltmc.qsl.networking.api.ServerPlayConnectionEvents;

public class PlayerJoinEvent {
	public static void register() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			handler.getPlayer().sendMessage(Text.of("Welcome to Content Styled!"), false);
		});
	}
}
