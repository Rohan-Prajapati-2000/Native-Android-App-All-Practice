package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnSecond, btnThird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecond=findViewById(R.id.btnSecond);
        btnThird=findViewById(R.id.btnThird);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secAct = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secAct);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iThird = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(iThird);
            }
        });

    }
}