package com.example.administrator.myapplication;

import java.util.Random;

/**
 * Created by mok17 on 9/28/2015.
 */
public class TeamDB {
    public String teamName;
    public int teamGoals;
    public int teamShots;
    public int teamFouls;
    public String teamMembers;


    public TeamDB(String team){

        Random num = new Random();
        int randInt1;
        int randInt2;
        int randInt3;
        int randInt4;

        randInt1 = num.nextInt(10); //fix for height and weight.
        randInt2 = num.nextInt(10);
        randInt3 = num.nextInt(10);
        randInt4 = num.nextInt(10);


        teamName = team;
        teamGoals = randInt1;
        teamShots = randInt2;
        teamFouls = randInt3;
        //teamMembers = members;
    }
}
