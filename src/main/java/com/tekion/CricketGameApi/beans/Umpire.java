package com.tekion.CricketGameApi.beans;

import lombok.Data;

@Data
public class Umpire {
    private String name;
    private String age;
    private long experience;
    private float correctDecisionProbability;
}
