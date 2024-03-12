package com.example.customfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView hindi, english, french;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hindi=findViewById(R.id.tvHindi);
        english=findViewById(R.id.tvEnglish);
        french=findViewById(R.id.tvFrench);

        Typeface hindiFont= Typeface.createFromAsset(getAssets(), "custom_font/Hindi.TTF");
        hindi.setTypeface(hindiFont);

        Typeface frenchFont= Typeface.createFromAsset(getAssets(), "custom_font/French.ttf");
        french.setTypeface(frenchFont);


    }
}