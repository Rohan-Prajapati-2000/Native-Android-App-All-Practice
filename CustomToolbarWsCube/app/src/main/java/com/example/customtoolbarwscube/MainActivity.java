package com.example.customtoolbarwscube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);

        // Step - 1
        setSupportActionBar(toolbar);

        // Step - 2
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setTitle("My Toolbar");
        toolbar.setSubtitle("My Sub Title");


    }
}