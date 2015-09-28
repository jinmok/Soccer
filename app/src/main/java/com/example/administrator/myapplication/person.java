package com.example.administrator.myapplication;

import java.io.Serializable;

/**
 * Created by binghami17 on 9/27/2015.
 */
public class person implements Serializable{

    public String name;
    public String stat1;

    protected person()
    {

        name = "John Doe";
        stat1 = "6";

    }

}
