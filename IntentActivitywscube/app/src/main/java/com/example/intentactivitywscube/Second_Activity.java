package com.example.intentactivitywscube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    TextView tvName, tvRollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromMainActivity = getIntent();
        String title = fromMainActivity.getStringExtra("title");
        String studentname = fromMainActivity.getStringExtra("StudentName");
        int rollno = fromMainActivity.getIntExtra("RollNo", 0);

        tvName=findViewById(R.id.tvName);
        tvRollNo=findViewById(R.id.tvRollNo);

        tvName.setText("Student Name: "+studentname);
        tvRollNo.setText("Roll Number: "+rollno);

//        getSupportActionBar().setTitle(title);
    }
}