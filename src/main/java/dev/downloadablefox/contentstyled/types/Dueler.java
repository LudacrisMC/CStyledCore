package dev.downloadablefox.contentstyled.types;

import java.util.List;
import java.util.UUID;

public class Dueler {
	private final UUID playerUuid;
	private final DuelerStats stats;
	private final List<UUID> friends;
	private String discordId;

	public Dueler(UUID playerUuid, String discordId, DuelerStats stats, List<UUID> friends) {
		this.playerUuid = playerUuid;
		this.discordId = discordId;
		this.stats = stats;
		this.friends = friends;
	}

	public UUID getPlayerUuid() {
		return this.playerUuid;
	}

	public String getDiscordId() {
		return this.discordId;
	}

	public void setDiscordId(String discordId) {
		this.discordId = discordId;
	}

	public DuelerStats getStats() {
		return this.stats;
	}
}
