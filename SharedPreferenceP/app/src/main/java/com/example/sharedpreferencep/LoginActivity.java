package com.example.sharedpreferencep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
TextView tvText;
EditText etUserName, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=findViewById(R.id.btnLogin);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        tvText=findViewById(R.id.txtView);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for verification
                String userName = etUserName.getText().toString();
                String password = etPassword.getText().toString();

                if (userName.equals("rohan_123") && password.equals("rohan123")) {
                    SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean("flag", true);
                    editor.apply();
                    Intent iHome = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(iHome);
                }else {
                    tvText.setText("User Name or Password Is Incorrect");
                    tvText.setTextColor(getResources().getColor(R.color.red));
                }


            }
        });
    }
}