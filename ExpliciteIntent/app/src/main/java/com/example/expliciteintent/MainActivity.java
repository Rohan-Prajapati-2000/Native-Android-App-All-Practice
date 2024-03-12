package com.example.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tv_name, tv_contact, tv_mail;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name=findViewById(R.id.tvName);
        tv_contact=findViewById(R.id.tvContactNo);
        tv_mail=findViewById(R.id.tvMailId);
        btn_submit=findViewById(R.id.btnSubmit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=tv_name.getText().toString();
                String data1=tv_contact.getText().toString();
                String data2=tv_mail.getText().toString();
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dataname", data);
                intent.putExtra("dataname1", data1);
                intent.putExtra("dataname2", data2);
                startActivity(intent);
            }
        });


    }
}