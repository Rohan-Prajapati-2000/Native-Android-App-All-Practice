package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AllDBMethod db = new AllDBMethod(this);

        db.addContact("Rohan", "7238073325");
        db.addContact("Rohan2", "9129920232");
        db.addContact("Pooja", "7065520576");



    }
}