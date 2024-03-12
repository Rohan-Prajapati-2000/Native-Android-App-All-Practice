package com.example.impliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView quote;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quote=findViewById(R.id.tvquote);
        share=findViewById(R.id.btnshare);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quoteText=quote.getText().toString();
                Intent sentIntent= new Intent();
                sentIntent.setAction(Intent.ACTION_SEND);
                sentIntent.setType("text/plain");
                sentIntent.putExtra(Intent.EXTRA_TEXT, quoteText);
                startActivity(sentIntent);
            }
        });
    }
}