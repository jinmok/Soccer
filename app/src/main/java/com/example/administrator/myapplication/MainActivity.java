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

    ArrayList<String> course;

    HashMap<String, person> holder;
    person p1;
    person p2;
    person p3;
    person p4;
    person p5;
    person p6;
    person p7;
    person p8;
    person p9;
    person p10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = new person();
        p2 = new person();
        p3 = new person();
        p4 = new person();
        p5 = new person();
        p6 = new person();
        p7 = new person();
        p8 = new person();
        p9 = new person();
        p10 = new person();


        //p1.name = "Frodo Baggins";
        //p1.stat1 = "0";

        course = new ArrayList<String>();
        course.add("Players");
        course.add("Frodo");
        course.add("Harry");
        course.add("Michael");
        course.add("Gandalf");
        course.add("Ron");
        course.add("Samwise");
        course.add("Tom");
        course.add("Hodor");
        course.add("John");
        course.add("Daenerys");

        holder = new HashMap<String, person>();
        holder.put("Frodo Baggins", p1);
        holder.put("Harry Potter", p2);
        holder.put("Michael Jordan", p3);
        holder.put("Gandalf White", p4);
        holder.put("Ron Weasley", p5);
        holder.put("Samwise Gamgee", p6);
        holder.put("Tom Riddle", p7);
        holder.put("Hodor Hodor", p8);
        holder.put("John Snow", p9);
        holder.put("Daenerys Targaryen", p10);

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

        if(v == GoOn)
        {

            Intent intent = new Intent(MainActivity.this,MainActivity2Activity.class);

            //intent.putExtra();

            intent.putExtra("person",p1);

            intent.putExtra("table",holder);

            startActivityForResult(intent, 100);

        }
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
