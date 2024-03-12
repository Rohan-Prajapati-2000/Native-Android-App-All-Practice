package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTralation, btnAlpha, btnScale, btnRotate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim=findViewById(R.id.txtAnim);
        btnTralation=findViewById(R.id.btnTralation);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnScale=findViewById(R.id.btnScale);
        btnRotate=findViewById(R.id.btnRotate);




        btnTralation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation moveAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                txtAnim.startAnimation(moveAnim);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alphaAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                txtAnim.startAnimation((alphaAnim));
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scaleAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                txtAnim.startAnimation(scaleAnim);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotateAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                txtAnim.startAnimation(rotateAnim);
            }
        });

    }
}