package dev.downloadablefox.contentstyled.types;

public class DuelerStats {
	private Double level;
	private Integer wins;
	private Integer losses;
	private Integer draws;
	private Integer kills;
	private Integer deaths;

	public DuelerStats(Double level, Integer wins, Integer losses, Integer draws, Integer kills, Integer deaths) {
		this.level = level;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.kills = kills;
		this.deaths = deaths;
	}

	public Double getLevel() {
		return this.level;
	}

	public Integer getWins() {
		return this.wins;
	}

	public Integer getLosses() {
		return this.losses;
	}

	public Integer getDraws() {
		return this.draws;
	}

	public Integer getKills() {
		return this.kills;
	}
}
