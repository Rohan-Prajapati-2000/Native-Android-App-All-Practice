package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
Button btnFirst, btnThirdfromSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnFirst=findViewById(R.id.btnFirst);
        btnThirdfromSecond=findViewById(R.id.btnThirdfromSecond);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fstAct = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(fstAct);
            }
        });

        btnThirdfromSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trdAct = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(trdAct);
            }
        });

    }
}