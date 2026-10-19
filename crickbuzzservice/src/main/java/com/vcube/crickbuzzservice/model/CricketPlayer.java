package com.vcube.crickbuzzservice.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
//@Table(name = "cricketPlayers")
public class CricketPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private String country;
    private String role;
    private String format;
    private Integer matchesPlayed;
    private Integer runsScored;
    private Integer highestScore;
    private Double battingAverage;
    private Double strikeRate;
    private Integer wicketsTaken;
    private Double economyRate;

    public CricketPlayer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public Integer getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(Integer highestScore) {
        this.highestScore = highestScore;
    }

    public Double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(Double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(Double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public Integer getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(Integer wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public Double getEconomyRate() {
        return economyRate;
    }

    public void setEconomyRate(Double economyRate) {
        this.economyRate = economyRate;
    }
}
