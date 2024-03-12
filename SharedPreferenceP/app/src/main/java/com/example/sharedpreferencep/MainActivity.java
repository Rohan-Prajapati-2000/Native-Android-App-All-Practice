package com.example.sharedpreferencep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                Boolean check = pref.getBoolean("flag", false);
                Intent iNext;
                if(check){      // for true if user has Logged In
                    iNext = new Intent(MainActivity.this, HomeActivity.class);
                }else {         // for false if user has Logged out
                    iNext = new Intent(MainActivity.this, LoginActivity.class);
                }
                startActivity(iNext);
                finish();
            }
        }, 4000);

    }
}