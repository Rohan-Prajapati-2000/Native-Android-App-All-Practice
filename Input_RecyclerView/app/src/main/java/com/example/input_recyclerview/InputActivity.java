package com.example.input_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
EditText etInput;
Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        etInput = findViewById(R.id.etInput);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name;
                name=etInput.getText().toString();

                if(name.isEmpty()){
                    etInput.setError("Please Enter Name");
                }else {
                    Intent iSave = new Intent(InputActivity.this, MainActivity.class);
                    iSave.putExtra("name", name);
                    setResult(RESULT_OK, iSave);
                    finish();
                }
            }
        });

    }
}