package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstName, secondName, contactNo;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName=findViewById(R.id.firstName);
        secondName=findViewById(R.id.secondName);
        contactNo=findViewById(R.id.contactNo);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstNameText=firstName.getText().toString();
                String secondNameText=secondName.getText().toString();
                int contactNumber=Integer.parseInt(contactNo.getText().toString());


                Intent submit = new Intent(MainActivity.this, SecondActivity.class);
                submit.putExtra("name", firstNameText);
                submit.putExtra("secondname", secondNameText);
                submit.putExtra("contactNumber", contactNumber);

                startActivity(submit);

            }
        });


    }
}
