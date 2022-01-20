package com.tekion.CricketGameApi.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Team {
    private List<Player> players;
    private String name;
    private int runsToBeat;
    private int totalRuns;
    private int dotBalls;
    private int sixes;
    private int fours;
    private int wickets;
    private int ballsPlayed;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunsToBeat() {
        return runsToBeat;
    }

    public void setRunsToBeat(int runsToBeat) {
        this.runsToBeat = runsToBeat;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getDotBalls() {
        return dotBalls;
    }

    public void setDotBalls(int dotBalls) {
        this.dotBalls = dotBalls;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }

    public Team(List<Player> players, String name, int runsToBeat, int totalRuns, int dotBalls, int sixes, int fours, int wickets, int ballsPlayed) {
        this.players = players;
        this.name = name;
        this.runsToBeat = runsToBeat;
        this.totalRuns = totalRuns;
        this.dotBalls = dotBalls;
        this.sixes = sixes;
        this.fours = fours;
        this.wickets = wickets;
        this.ballsPlayed = ballsPlayed;
    }

    public Team() {
    }
}
