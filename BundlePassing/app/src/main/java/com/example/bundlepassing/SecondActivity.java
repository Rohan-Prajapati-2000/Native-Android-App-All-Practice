package com.example.bundlepassing;

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

        stdInfo = findViewById(R.id.stdInfo);

        Intent getValue = getIntent();
        int rollNumber = getValue.getIntExtra("rollNo",0);
        String names = getValue.getStringExtra("name");
        stdInfo.setText("Roll No:" + rollNumber + ",\n Name: "+names);





//
//        Intent getData = getIntent();
//        int rollNo = getData.getIntExtra("rollno", 0);
//        String name = getData.getStringExtra("name");
//        stdInfo.setText("Roll No: "+rollNo+",\n Name: "+name);

    }
}