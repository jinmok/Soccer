package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends ActionBarActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Button AddPerson;
    Button GoOn;
    Button RemovePerson;
    Button Team1;
    Button Team2;
    Button customTeam;


    TextView textTeamName;
    TextView textGoals;
    TextView textShots;
    TextView textFouls;
    TextView textMembers;

    //Spinner PersonSpinner;

    //ArrayList<String> course;

    HashMap<String, SoccerPlayer> playerData;
    HashMap<String, TeamDB> teamData;
    SoccerPlayer p1;
    SoccerPlayer p2;
    SoccerPlayer p3;
    SoccerPlayer p4;
    SoccerPlayer p5;
    SoccerPlayer p6;
    SoccerPlayer p7;
    SoccerPlayer p8;
    SoccerPlayer p9;
    SoccerPlayer p10;
    SoccerPlayer p11;
    SoccerPlayer p12;
    SoccerPlayer p13;
    SoccerPlayer p14;
    SoccerPlayer p15;
    SoccerPlayer p16;
    SoccerPlayer p17;
    SoccerPlayer p18;
    SoccerPlayer p19;
    SoccerPlayer p20;


    TeamDB t1 = new TeamDB("Gryffindor");
    TeamDB t2 = new TeamDB("House Stark");
    TeamDB t3 = new TeamDB("Middle Earth");
    TeamDB t4 = new TeamDB("Custom Team");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = new SoccerPlayer("Harry Potter", "Forward", t1);
        p2 = new SoccerPlayer("Ron Weasley", "Forward", t1);
        p3 = new SoccerPlayer("Hermione Granger", "Midfield", t1);
        p4 = new SoccerPlayer("Neville Longbottom", "Defense", t1);
        p5 = new SoccerPlayer("Albus Dumbledore", "Goalkeeper", t1);
        p6 = new SoccerPlayer("John Snow", "Forward", t2);
        p7 = new SoccerPlayer("Arya Stark", "Defense", t2);
        p8 = new SoccerPlayer("Sansa Stark", "Defense", t2);
        p9 = new SoccerPlayer("Brandon Stark", "Midfield", t2);
        p10 = new SoccerPlayer("Eddard Stark", "Goalkeeper", t2);
        p11 = new SoccerPlayer("Frodo Baggins", "Forward", t3);
        p12 = new SoccerPlayer("Samwise Gamgee", "Forward", t3);
        p13 = new SoccerPlayer("Legolas Greenleaf", "Defense", t3);
        p14 = new SoccerPlayer("Peregrin Pippin Took", "Defense", t3);
        p15 = new SoccerPlayer("Meriadoc Merry Brandybuck", "GoalKeeper", t3);
        p16 = new SoccerPlayer("Katniss Everdeen", "Forward", t4);
        p17 = new SoccerPlayer("Peeta Mellark", "Forward", t4);
        p18 = new SoccerPlayer("Gale Something", "Midfield", t4);
        p19 = new SoccerPlayer("Effie Trinket", "Defense", t4);
        p20 = new SoccerPlayer("Haymitch Something", "GoalKeeper", t4);


        //p1.name = "Frodo Baggins";
        //p1.stat1 = "0";

//        course = new ArrayList<String>();
//        course.add("Players");
//        course.add("Frodo");
//        course.add("Harry");
//        course.add("Michael");
//        course.add("Gandalf");
//        course.add("Ron");
//        course.add("Samwise");
//        course.add("Tom");
//        course.add("Hodor");
//        course.add("John");
//        course.add("Daenerys");

        playerData = new HashMap<String, SoccerPlayer>();
        playerData.put("Harry", p1);
        playerData.put("Ron", p2);
        playerData.put("Hermione", p3);
        playerData.put("Neville", p4);
        playerData.put("Albus", p5);
        playerData.put("Frodo", p6);
        playerData.put("Samwise", p7);
        playerData.put("Legolas", p8);
        playerData.put("Pippin", p9);
        playerData.put("Merry", p10);
        playerData.put("John Snow", p11);
        playerData.put("Arya", p12);
        playerData.put("Sansa", p13);
        playerData.put("Brandon", p14);
        playerData.put("Eddard", p15);
        playerData.put("Katniss", p16);
        playerData.put("Peeta", p17);
        playerData.put("Gale", p18);
        playerData.put("Effie", p19);
        playerData.put("Haymitch", p20);

        AddPerson = (Button) findViewById(R.id.AddPerson);
        AddPerson.setOnClickListener(this);

        Team1 = (Button) findViewById(R.id.Team1);
        Team1.setOnClickListener(this);

        Team2 = (Button) findViewById(R.id.Team2);
        Team2.setOnClickListener(this);

        customTeam = (Button) findViewById(R.id.customTeam);
        customTeam.setOnClickListener(this);


        textTeamName = (TextView) findViewById(R.id.textTeamName);
        textGoals = (TextView) findViewById(R.id.textGoals);
        textShots = (TextView) findViewById(R.id.textShots);
        textFouls = (TextView) findViewById(R.id.textFouls);
        textMembers = (TextView) findViewById(R.id.textMembers);
//
//        PersonSpinner = (Spinner) findViewById(R.id.PersonSpinner);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, course);
//        PersonSpinner.setAdapter(adapter);
//        PersonSpinner.setOnItemSelectedListener(this);


    }


    @Override
    public void onClick(View v) {

//        if(v == AddPerson)
//        {
//            if(iFirstNameOfPerson.getText().toString().equals("") || iLastNameOfPerson.getText().toString().equals("") || iTeamOfPerson.getText().toString().equals("")
//                    || iUniformOfPerson.getText().toString().equals("") || iHeightOfPerson.getText().toString().equals("") || iWeightOfPerson.getText().toString().equals("")
//                    || iGoalsOfPerson.getText().toString().equals(""))
//            {
//                return;
//            }
//            else {
//                person pTemp = new person();
//                pTemp.name = iFirstNameOfPerson.getText().toString();
//                pTemp.stat1 = iLastNameOfPerson.getText().toString();
//
//                holder.put(iFirstNameOfPerson.getText().toString(), pTemp);
//
//                course.add(iLastNameOfPerson.getText().toString());
//            }
//        }


        //if(v == Team1)
        //show stats

        //if(v == Team2)
        //show stats

        if(v == AddPerson)
        {

            Intent intent = new Intent(MainActivity.this,MainActivity2Activity.class);

            //intent.putExtra();

            //intent.putExtra("person",p1);

            //intent.putExtra("table",holder);

            startActivityForResult(intent, 100);

        }


    }


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == 100)
//        {
//
//            if(resultCode == 1)
//            {
//
//                String a = data.getStringExtra("go back");
//                oFirstNameOfPerson.setText(a);
//
//            }
//
//        }
//
//
//    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//        if(view == PersonSpinner)
//        {
//
//            person pTemp = holder.get(PersonSpinner.getSelectedItem().toString());
//            oFirstNameOfPerson.setText(pTemp.name);
//            oLastNameOfPerson.setText(pTemp.stat1);
//
//
//        }

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}//end of main
