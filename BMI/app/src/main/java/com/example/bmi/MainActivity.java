package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etWeight, etHeightFeet, etHeightInch;
        Button btnCalculate;
        TextView etShowResult;
        LinearLayout llmain;

        etWeight=findViewById(R.id.etWeight);
        etHeightFeet=findViewById(R.id.etHeightFeet);
        etHeightInch=findViewById(R.id.etHeightInch);
        btnCalculate=findViewById(R.id.btnCalculate);
        etShowResult=findViewById(R.id.tvResult);
        llmain=findViewById(R.id.llmain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight= Integer.parseInt(etWeight.getText().toString());
                int heightFeet = Integer.parseInt(etHeightFeet.getText().toString());
                int heightInch = Integer.parseInt(etHeightInch.getText().toString());

                int totalInch = (heightFeet*12)+heightInch;

                double totalcm= totalInch*2.53;

                double totalmeter = totalcm/100;

                double bgm = weight/(totalmeter*totalmeter);

                if (bgm>25){
                    etShowResult.setText("You Are OverWeight "+ String.format("%.2f", bgm));
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorOverWeight));
                } else if (bgm<18) {
                    etShowResult.setText("You Are UnderWeight "+ String.format("%.2f",bgm));
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorUnderWeight));
                } else{
                    etShowResult.setText("You Are Healthy: "+ String.format("%.2f",bgm));
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorHealthy));
                }
            }
        });



    }
}