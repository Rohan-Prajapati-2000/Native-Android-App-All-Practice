package com.example.roomlibrarydb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etText, etAmount;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        etAmount = findViewById(R.id.etAmount);
        btnAdd = findViewById(R.id.btnAdd);

        DataBaseHelper dataBaseHelper = DataBaseHelper.getDB(MainActivity.this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = etText.getText().toString();
                String amount = etAmount.getText().toString();

                dataBaseHelper.expenseDAO().addNew(
                        new Expenses(title, amount)
                );

                ArrayList<Expenses> arrayExpenses = (ArrayList<Expenses>) dataBaseHelper.expenseDAO().getAllExpense();

                for (int i = 0; i < arrayExpenses.size(); i++) {
                    Log.d("ExpenseList", "Title: " + arrayExpenses.get(i).getTitle() + " Amount: " + arrayExpenses.get(i).getAmount());
                }
            }
        });
    }
}