package com.example.listviewwscube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView acTextView;

    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayIdList=new ArrayList<>();
    ArrayList<String> arrayLanguage= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        spinner=findViewById(R.id.spinnertextview);
        acTextView=findViewById(R.id.acTextView);

        arrayList.add("Amit");
        arrayList.add("Rohit");
        arrayList.add("Mohit");
        arrayList.add("Sohit");
        arrayList.add("Karan");
        arrayList.add("Sumit");
        arrayList.add("Akash");
        arrayList.add("Vikas");
        arrayList.add("Sumit");
        arrayList.add("Aryan");
        arrayList.add("Aditya");
        arrayList.add("Adarsh");
        arrayList.add("Ram");
        arrayList.add("Shyam");
        arrayList.add("Harsh");
        arrayList.add("Chandrakant");
        arrayList.add("Jadoo");
        arrayList.add("Nayan");
        arrayList.add("Ansh");
        arrayList.add("Naruto");
        arrayList.add("Sasuke");
        arrayList.add("Hinata");
        arrayList.add("Sakura");
        arrayList.add("Itachi");
        arrayList.add("Madara");
        arrayList.add("Lie");
        arrayList.add("Amit");
        arrayList.add("Rohit");
        arrayList.add("Mohit");
        arrayList.add("Sohit");
        arrayList.add("Karan");
        arrayList.add("Sumit");
        arrayList.add("Akash");
        arrayList.add("Vikas");
        arrayList.add("Sumit");
        arrayList.add("Aryan");
        arrayList.add("Aditya");
        arrayList.add("Adarsh");
        arrayList.add("Ram");
        arrayList.add("Shyam");
        arrayList.add("Harsh");
        arrayList.add("Chandrakant");
        arrayList.add("Jadoo");
        arrayList.add("Nayan");
        arrayList.add("Ansh");
        arrayList.add("Naruto");
        arrayList.add("Sasuke");
        arrayList.add("Hinata");
        arrayList.add("Sakura");
        arrayList.add("Itachi");
        arrayList.add("Madara");
        arrayList.add("Lie");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(listAdapter);



        // Spinner ArrayList

        arrayIdList.add("Aadhar Card");
        arrayIdList.add("Pan Card");
        arrayIdList.add("Votar Id Card");
        arrayIdList.add("Driving License Card");
        arrayIdList.add("Rashan Card");
        arrayIdList.add("Labour Card");
        arrayIdList.add("ESI Card");
        arrayIdList.add("Birth Cirtificate");
        arrayIdList.add("10th Marksheet");
        arrayIdList.add("12th Marksheet");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrayIdList);
        spinner.setAdapter(spinnerArrayAdapter);






        // Auto Complete Text
        arrayLanguage.add("C");
        arrayLanguage.add("C++");
        arrayLanguage.add("Java");
        arrayLanguage.add("Java Script");
        arrayLanguage.add("Python");
        arrayLanguage.add("C#");
        arrayLanguage.add("Kotlin");
        arrayLanguage.add("HTML");
        arrayLanguage.add("CSS");
        arrayLanguage.add("MongoDB");
        arrayLanguage.add("MySQL");
        arrayLanguage.add("NoSQL");
        arrayLanguage.add("DataBase");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayLanguage);
        acTextView.setAdapter(actvAdapter);
        acTextView.setThreshold(1);











    }
}