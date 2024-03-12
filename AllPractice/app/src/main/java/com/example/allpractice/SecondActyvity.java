package com.example.allpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActyvity extends AppCompatActivity {
EditText txtName, txtRollNo;
Button btn2Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actyvity);

        txtName=findViewById(R.id.etName);
        txtRollNo=findViewById(R.id.etRollNo);
        btn2Next=findViewById(R.id.btn2Next);
        btn2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString().trim();
                String rollNumString = txtRollNo.getText().toString().trim();

                if (name.isEmpty()){
                        txtName.setError("Please Enter Name");
                        return;
                }
                int rollNum;
                if (!rollNumString.isEmpty()){
                    try {
                        rollNum=Integer.parseInt(rollNumString);
                    }catch (Exception e) {
                        txtRollNo.setError("Please Enter Roll Number");
                        return;
                    }
                }else {
                    txtRollNo.setError("Please Enter Roll Number");
                    return;
                }
                Intent iNext = new Intent(SecondActyvity.this, ThirdActivity.class);
                iNext.putExtra("name", name);
                iNext.putExtra("rollNum", rollNum);
                startActivity(iNext);
            }
        });
    }
}