package com.tekion.CricketGameApi.controller;

import com.tekion.CricketGameApi.util.StartMatchUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {
    @RequestMapping("/match")
    public String startMatch(){
        return StartMatchUtil.startMatch();
    }
}
