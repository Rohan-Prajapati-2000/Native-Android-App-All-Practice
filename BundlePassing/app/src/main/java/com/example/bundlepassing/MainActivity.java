package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnNext;
EditText txtRollNo, txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=findViewById(R.id.btnNext);
        txtRollNo=findViewById(R.id.txtRollNo);
        txtName=findViewById(R.id.txtname);




        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(MainActivity.this, SecondActivity.class);

                String names = txtName.getText().toString();
                String rollNumber = txtRollNo.getText().toString();

                intentNext.putExtra("rollNo", Integer.parseInt(rollNumber));
                intentNext.putExtra("name", names);
                startActivity(intentNext);
            }
        });





//        intentNext.putExtra("rollno", 253);
////        intentNext.putExtra("rollno", "5");     // it is wrong coz roll number is in int and we can not have roll number in string
//                                                            // we can have this value in string when we are getting value in string from second activity
//        intentNext.putExtra("name", "Naman");
//
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(intentNext);
//            }
//        });
    }
}