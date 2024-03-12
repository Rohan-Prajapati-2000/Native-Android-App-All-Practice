package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper db = new DBHelper(MainActivity.this);

        db.addContact("Raman", "9876549878");
        db.addContact("Karan", "9876987699");
        db.addContact("Charan", "9876987688");
        db.addContact("Naman", "9876987677");
        db.addContact("Tarun", "9876549866");
        db.addContact("Daman", "9876549855");


//        StructureContext context = new StructureContext();
//        context.id=1;
//        context.phone_no="0000000000";
//        db.updateInfo(context);

        db.deleteContact(1);


        ArrayList<StructureContext> arrayList = db.fetchInfo();
        for (int i=0; i<arrayList.size(); i++){
            Log.d("STUDENT_INFO ", "Name: " + arrayList.get(i).name + ", Phone Number: " + arrayList.get(i).phone_no);
        }


    }
}