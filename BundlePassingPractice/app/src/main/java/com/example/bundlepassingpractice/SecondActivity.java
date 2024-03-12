package com.example.bundlepassingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView stdInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stdInfo=findViewById(R.id.stdInfo);

        Intent getValue = getIntent();
        String stdName = getValue.getStringExtra("name");
        int rollNumbers = getValue.getIntExtra("rollNumber", 0);
        stdInfo.setText("Roll Number: "+rollNumbers+"\nName: "+stdName);

    }
}