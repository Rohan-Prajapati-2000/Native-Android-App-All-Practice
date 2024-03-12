package com.example.allpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnNext, btnKartikPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=findViewById(R.id.btnNext);
        btnKartikPic=findViewById(R.id.btnkartikPic);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext = new Intent(MainActivity.this, SecondActyvity.class);
                startActivity(iNext);
            }
        });

        btnKartikPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pic = new Intent(MainActivity.this, KartikPicActivity.class);
                startActivity(pic);
            }
        });

    }
}