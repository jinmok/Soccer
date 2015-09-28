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
    Intent intent = this.getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);


        //String a = intent.getStringExtra("testing");
        //person b = (person) intent.getSerializableExtra("person");

        GoBack = (Button) findViewById(R.id.GoBack);
        GoBack.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        //intent.putExtra("go back", "yay");
        //setResult(1);

        finish();

    }



}
