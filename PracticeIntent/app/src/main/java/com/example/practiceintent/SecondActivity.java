package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView getInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getInfo=findViewById(R.id.getInfo);

        Intent GetMainActivity= getIntent();
        String FirstName = GetMainActivity.getStringExtra("name");
        String SecondName = GetMainActivity.getStringExtra("secondname");
        int ContactNumber = GetMainActivity.getIntExtra("contactNumber", 0);

        getInfo.setText("First Name: " +FirstName+ ", Second Name: " +SecondName+ ", Contact Number: "+ContactNumber);

    }
}
