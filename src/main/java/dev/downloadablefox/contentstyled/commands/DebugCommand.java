package dev.downloadablefox.contentstyled.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class DebugCommand {
	public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
		dispatcher.register(
			CommandManager.literal("debug")
				.requires(source -> source.hasPermissionLevel(2))
				.executes(context -> {
					context.getSource().sendFeedback(Text.of("Debug command executed!"), false);
					return 1;
				})
		);
	}
}
