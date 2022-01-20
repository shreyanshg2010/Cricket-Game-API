package com.tekion.CricketGameApi.util;

public class Toss {
    public static boolean toss(){
        return (int)(Math.random() * 2) == 0? true : false ;
    }
}