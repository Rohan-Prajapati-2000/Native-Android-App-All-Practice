package com.example.input_recyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
Button btnAdd;
ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btnAdd);

        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");
        arrayList.add("Ram");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        listView.setSelection(adapter.getCount()-1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAdd = new Intent(MainActivity.this, InputActivity.class);
                startActivityForResult(iAdd, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent getValue) {
        super.onActivityResult(requestCode, resultCode, getValue);
        if (requestCode==1 && resultCode==RESULT_OK){
            String newName = getValue.getStringExtra("name");
            if (newName!=null){
                arrayList.add(newName);
                ArrayAdapter <String> adapter = (ArrayAdapter<String>) listView.getAdapter();
                adapter.notifyDataSetChanged();

                listView.post(new Runnable() {
                    @Override
                    public void run() {
                        listView.setSelection(adapter.getCount()-1);
                    }
                });
            }
        }
    }
}