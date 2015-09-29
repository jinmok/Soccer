package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity implements View.OnClickListener{

    Button GoBack;
    Button Player1;
    Button Player2;
    Button Player3;
    Button Player4;
    Button Player5;
    Button Player6;
    Button Player7;
    Button Player8;
    Button Player9;
    Button Player10;
    Button Player11;
    Button Player12;
    Button Player13;
    Button Player14;
    Button Player15;
    Button Player16;
    Button Player17;
    Button Player18;
    Button Player19;
    Button Player20;
    Button AddToTeam;
    Button RemoveFromTeam;

    Intent intent = this.getIntent();

    TextView textName;
    TextView textPosition;
    TextView textTeam;
    TextView textUniform;
    TextView textHeight;
    TextView textWeight;
    TextView textGoals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);


        //String a = intent.getStringExtra("testing");
        //person b = (person) intent.getSerializableExtra("person");

        GoBack = (Button) findViewById(R.id.GoBack);
        GoBack.setOnClickListener(this);

        Player1 = (Button) findViewById(R.id.Player1);
        Player1.setOnClickListener(this);
        Player2 = (Button) findViewById(R.id.Player1);
        Player2.setOnClickListener(this);
        Player3 = (Button) findViewById(R.id.Player1);
        Player3.setOnClickListener(this);
        Player4 = (Button) findViewById(R.id.Player1);
        Player4.setOnClickListener(this);
        Player5 = (Button) findViewById(R.id.Player1);
        Player5.setOnClickListener(this);
        Player6 = (Button) findViewById(R.id.Player1);
        Player6.setOnClickListener(this);
        Player7 = (Button) findViewById(R.id.Player1);
        Player7.setOnClickListener(this);
        Player8 = (Button) findViewById(R.id.Player1);
        Player8.setOnClickListener(this);
        Player9 = (Button) findViewById(R.id.Player1);
        Player9.setOnClickListener(this);
        Player10 = (Button) findViewById(R.id.Player1);
        Player10.setOnClickListener(this);
        Player11 = (Button) findViewById(R.id.Player1);
        Player11.setOnClickListener(this);
        Player12 = (Button) findViewById(R.id.Player1);
        Player12.setOnClickListener(this);
        Player13 = (Button) findViewById(R.id.Player1);
        Player13.setOnClickListener(this);
        Player14 = (Button) findViewById(R.id.Player1);
        Player14.setOnClickListener(this);
        Player15 = (Button) findViewById(R.id.Player1);
        Player15.setOnClickListener(this);
        Player16 = (Button) findViewById(R.id.Player1);
        Player16.setOnClickListener(this);
        Player17 = (Button) findViewById(R.id.Player1);
        Player17.setOnClickListener(this);
        Player18 = (Button) findViewById(R.id.Player1);
        Player18.setOnClickListener(this);
        Player19 = (Button) findViewById(R.id.Player1);
        Player19.setOnClickListener(this);
        Player20 = (Button) findViewById(R.id.Player1);
        Player20.setOnClickListener(this);

        textName = (TextView) findViewById(R.id.textName);
        textPosition = (TextView) findViewById(R.id.textPosition);
        textTeam = (TextView) findViewById(R.id.textTeam);
        textUniform = (TextView) findViewById(R.id.textUniform);
        textHeight = (TextView) findViewById(R.id.textHeight);
        textWeight = (TextView) findViewById(R.id.textWeight);
        textGoals = (TextView) findViewById(R.id.textGoals);

    }


    @Override
    public void onClick(View v) {

        //intent.putExtra("go back", "yay");
        //setResult(1);

        finish();

    }



}
