package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
EditText etName;
Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName=findViewById(R.id.etName);
        btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();

                if (name!=null) {
                    Intent iSave = new Intent(SecondActivity.this, MainActivity.class);
                    iSave.putExtra("name", name);
                    setResult(RESULT_OK, iSave);
                    finish();
                }
            }
        });
    }
}