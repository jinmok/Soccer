package com.example.administrator.myapplication;

import java.util.Random;

/**
 * Created by mok17 on 9/27/2015.
 */
public class SoccerPlayer {
    public String playerName;
    public String playerPosition;
    public TeamDB playerTeam;
//    public int playerUniform;
//    public int playerHeight;
//    public int playerWeight;
//    public int playerGoals;


    public SoccerPlayer(String name, String position, TeamDB team){

//        Random num = new Random();
//        int randInt1;
//        int randInt2;
//        int randInt3;
//        int randInt4;
//
//        randInt1 = num.nextInt(10); //fix for height and weight.
//        randInt2 = num.nextInt(190);
//        randInt3 = num.nextInt(300);
//        randInt4 = num.nextInt(10);

        playerName = name;
        playerPosition = position;
        playerTeam = new TeamDB("");
//        playerUniform = randInt1;
//        playerHeight = randInt2;
//        playerWeight = randInt3;
//        playerGoals = randInt4;
    }

}
