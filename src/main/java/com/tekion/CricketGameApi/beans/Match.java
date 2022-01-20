package com.tekion.CricketGameApi.beans;

import java.util.Date;

public class Match {
    String name;
    String groundName;
    Date date;
    Team team1, team2, first, second;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Match(String name, String groundName, Date date, Team team1, Team team2, Team first, Team second) {
        this.name = name;
        this.groundName = groundName;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.first = first;
        this.second = second;
    }

    public String getGroundName() {
        return groundName;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getFirst() {
        return first;
    }

    public void setFirst(Team first) {
        this.first = first;
    }

    public Team getSecond() {
        return second;
    }

    public void setSecond(Team second) {
        this.second = second;
    }

    public String toString(){
        return "<p><b><center>" + name + "</center></b></p>" +
                "<p><b><center>" + groundName + "</center></b></p>" +
                "<p><b><center>" + date + "</center></b></p>";

    }
}
