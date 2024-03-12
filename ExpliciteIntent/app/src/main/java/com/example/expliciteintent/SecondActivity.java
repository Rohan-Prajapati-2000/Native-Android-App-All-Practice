package com.example.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name, mob_no, mail;
    String data, datamob, datamail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=findViewById(R.id.name);
        mob_no=findViewById(R.id.contactnumber);
        mail=findViewById(R.id.mailid);

        Intent intent=getIntent();
        data=intent.getStringExtra("dataname");
        datamob=intent.getStringExtra("dataname1");
        datamail=intent.getStringExtra("dataname2");

        name.setText("Your Name Is: "+data);
        mob_no.setText("Your Contact No. Is: "+datamob);
        mail.setText("Your Mail Id Is: "+datamail);

    }
}