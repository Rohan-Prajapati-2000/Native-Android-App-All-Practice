package com.example.intentactivitywscube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;

        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext=new Intent(MainActivity.this, Second_Activity.class);
                intentNext.putExtra("title", "Home");
                intentNext.putExtra("StudentName", "Ram");
                intentNext.putExtra("RollNo", 10);
                startActivity(intentNext);

            }
        });
    }
}