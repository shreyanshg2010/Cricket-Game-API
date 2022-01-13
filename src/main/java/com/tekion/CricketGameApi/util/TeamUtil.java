package com.tekion.CricketGameApi.util;

import com.tekion.CricketGameApi.beans.Team;

public class TeamUtil {
    public static Team createTeam(String teamName) {
        Team team = new Team();
        team.setName(teamName);
        return team;
    }
}
