package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
Spinner spinnerView;
AutoCompleteTextView acTextView;
ArrayList<String> arrayList=new ArrayList<>();
ArrayList<String> arrayids = new ArrayList<>();

ArrayList<String> arrLanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        spinnerView=findViewById(R.id.spinnerView);
        acTextView=findViewById(R.id.actxtView);

        arrayList.add("Shyam");
        arrayList.add("Radha");
        arrayList.add("Seeta");
        arrayList.add("Raman");
        arrayList.add("Karan");
        arrayList.add("Naman");
        arrayList.add("Amit");
        arrayList.add("Namit");
        arrayList.add("Sumit");
        arrayList.add("Avi");
        arrayList.add("Savi");
        arrayList.add("Subham");
        arrayList.add("Harry");
        arrayList.add("Ankit");
        arrayList.add("Shivam");
        arrayList.add("Amit");
        arrayList.add("Rohit");
        arrayList.add("Mohit");
        arrayList.add("Sohit");
        arrayList.add("Aryan");
        arrayList.add("Aditya");
        arrayList.add("Ajeet");
        arrayList.add("Krishna");
        arrayList.add("Tom");
        arrayList.add("Iron Man");
        arrayList.add("Spider Man");
        arrayList.add("Thor");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, arrayList);
        listView.setAdapter(adapter);

//SPINNER
        arrayids.add("Adhar Card");
        arrayids.add("Pan Card");
        arrayids.add("Voter Id Card");
        arrayids.add("Driving License");
        arrayids.add("10th Marksheet");
        arrayids.add("12th Marksheet");
        arrayids.add("Ration Card");

        ArrayAdapter<String> spinneradapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrayids);
        spinnerView.setAdapter(spinneradapter);


        //AUTOCOMPLETE TEXT VIEW

        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("JAVA");
        arrLanguages.add("PYTHON");
        arrLanguages.add("C#");
        arrLanguages.add("KOTLIN");
        arrLanguages.add("JAVA SCRIPT");

        ArrayAdapter<String> acTextViewAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrLanguages);
        acTextView.setAdapter(acTextViewAdapter);
        acTextView.setThreshold(1);


    }
}