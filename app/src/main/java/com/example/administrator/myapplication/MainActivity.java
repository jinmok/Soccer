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
    Button GoBack;


    EditText iFirstNameOfPerson;
    EditText iLastNameOfPerson;
    EditText iTeamOfPerson;
    EditText iUniformOfPerson;
    EditText iHeightOfPerson;
    EditText iWeightOfPerson;
    EditText iGoalsOfPerson;

    TextView oFirstNameOfPerson;
    TextView oLastNameOfPerson;
    TextView oTeamOfPerson;
    TextView oUniformOfPerson;
    TextView oHeightOfPerson;
    TextView oWeightOfPerson;
    TextView oGoalsOfPerson;

    Spinner PersonSpinner;

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

        GoOn = (Button) findViewById(R.id.GoOn);
        GoOn.setOnClickListener(this);

        //GoBack = (Button) findViewById(R.id.GoBack);
        //GoBack.setOnClickListener(this);

//        iFirstNameOfPerson = (EditText) findViewById(R.id.iFirstNameOfPerson);
//        iLastNameOfPerson = (EditText) findViewById(R.id.iLastNameOfPerson);
//        iTeamOfPerson = (EditText) findViewById(R.id.iTeamOfPerson);
//        iUniformOfPerson = (EditText) findViewById(R.id.iUniformOfPerson);
//        iHeightOfPerson = (EditText) findViewById(R.id.iHeightOfPerson);
//        iWeightOfPerson = (EditText) findViewById(R.id.iWeightOfPerson);
//        iGoalsOfPerson = (EditText) findViewById(R.id.iGoalsOfPerson);
//
//        oFirstNameOfPerson = (TextView) findViewById(R.id.oFirstNameOfPerson);
//        oLastNameOfPerson = (TextView) findViewById(R.id.oLastNameOfPerson);
//        oTeamOfPerson = (TextView) findViewById(R.id.oTeamOfPerson);
//        oUniformOfPerson = (TextView) findViewById(R.id.oUniformOfPerson);
//        oHeightOfPerson = (TextView) findViewById(R.id.oHeightOfPerson);
//        oWeightOfPerson = (TextView) findViewById(R.id.oWeightOfPerson);
//        oGoalsOfPerson = (TextView) findViewById(R.id.oGoalsOfPerson);
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

            intent.putExtra("testing", "this is my string");

            intent.putExtra("person",p1);

            intent.putExtra("table",holder);

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
