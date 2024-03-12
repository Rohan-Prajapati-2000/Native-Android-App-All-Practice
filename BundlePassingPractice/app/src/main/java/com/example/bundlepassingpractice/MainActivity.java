package com.example.bundlepassingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText txtRollNo, txtName;
Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=findViewById(R.id.txtName);
        txtRollNo=findViewById(R.id.txtrollNo);
        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(MainActivity.this, SecondActivity.class);
                String names = txtName.getText().toString();
                String rollNumber = txtRollNo.getText().toString();
                intentNext.putExtra("name", names);
                intentNext.putExtra("rollNumber", Integer.parseInt(rollNumber));
                startActivity(intentNext);
            }
        });
    }
}