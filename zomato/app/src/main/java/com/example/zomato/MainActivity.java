package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.buttonLogin);
        register=findViewById(R.id.button_Register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked Login Button", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this, Sign_In_Activity.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Register Button Clicked", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this, Registration_Activity.class);
                startActivity(intent);
            }
        });

    }
}