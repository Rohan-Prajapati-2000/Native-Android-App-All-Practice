package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstvalue, secondvalue;
    TextView showresult;
    Button add, sub, multyply, divide, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstvalue=findViewById(R.id.firstValue);
        secondvalue=findViewById(R.id.secondValue);
        showresult=findViewById(R.id.resultView);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSub);
        multyply=findViewById(R.id.btnMultiply);
        divide=findViewById(R.id.btnDivide);
        equal=findViewById(R.id.btnEqualsToo);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int firstNum, secondNum, result;

                    firstNum = Integer.parseInt(firstvalue.getText().toString());
                    secondNum = Integer.parseInt((secondvalue.getText().toString()));

                    result = firstNum + secondNum;
                    showresult.setText("Answer Is: " + result);
                }
                catch (Exception e){
                    showresult.setText(e.getMessage());
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int firstNum, secondNum, result;

                    firstNum = Integer.parseInt(firstvalue.getText().toString());
                    secondNum = Integer.parseInt((secondvalue.getText().toString()));
                    result = firstNum - secondNum;
                    showresult.setText("Answer Is: " + result);
                }
                catch (Exception e){
                    showresult.setText(e.getMessage());
                }

            }
        });

        multyply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int firstNum, secondNum, result;

                    firstNum = Integer.parseInt(firstvalue.getText().toString());
                    secondNum = Integer.parseInt((secondvalue.getText().toString()));
                    result = firstNum * secondNum;
                    showresult.setText("Answer Is: " + result);
                }
                catch (Exception e){
                    showresult.setText(e.getMessage());
                }
            }
        });


            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {

                        float firstNum, secondNum;
                        float result;

                        firstNum = Integer.parseInt(firstvalue.getText().toString());
                        secondNum = Integer.parseInt((secondvalue.getText().toString()));
                        if (secondNum==0){
                            showresult.setText("Can't divide by zero");
                            return;
                        }

                        result = firstNum / secondNum;
                        showresult.setText("Answer Is: " +String.format("%.2f",result) );
                    }
                    catch (Exception e){
                        showresult.setText(e.getMessage());
                    }

                }

            });
        }
    }