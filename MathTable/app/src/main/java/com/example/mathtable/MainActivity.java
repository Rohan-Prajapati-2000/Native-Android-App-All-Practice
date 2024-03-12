package com.example.mathtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inputNum, showResult;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNum=findViewById(R.id.inputNumber);
        showResult=findViewById(R.id.resulttext);
        btnResult=findViewById(R.id.button);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long num=Integer.parseInt(inputNum.getText().toString());

                StringBuilder ans= new StringBuilder();
                for (long i=1; i<=10; i++){
                    ans = ans.append(num).append("X").append(i).append("=").append(num*i).append("\n");

                }
                showResult.setText(ans.toString());
            }
        });



    }
}