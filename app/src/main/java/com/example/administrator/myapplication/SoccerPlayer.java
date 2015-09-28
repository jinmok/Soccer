package com.example.administrator.myapplication;

import java.util.Random;

/**
 * Created by mok17 on 9/27/2015.
 */
public class SoccerPlayer {
    private String firstName;
    private String lastName;
    private String teamName;
    private int uniformNumber;
    private int height;
    private int weight;
    private int goals;


    public SoccerPlayer(String first, String last, String team, int uniform){

        Random num = new Random();
        int randInt;
        randInt = num.nextInt(10); //fix for height and weight.

        firstName = first;
        lastName = last;
        teamName = team;
        uniformNumber = uniform;
        height = randInt;
        weight = randInt;
        goals = randInt;
    }

}
