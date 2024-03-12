package com.example.allpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KartikPicActivity extends AppCompatActivity {
ListView listView;
ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartik_pic);

        listView=findViewById(R.id.listView);

        arrayList.add(R.drawable.img);
        arrayList.add(R.drawable.img1);
        arrayList.add(R.drawable.img2);
        arrayList.add(R.drawable.img3);
        arrayList.add(R.drawable.img4);
        arrayList.add(R.drawable.img5);
        arrayList.add(R.drawable.img6);
        arrayList.add(R.drawable.img7);
        arrayList.add(R.drawable.img8);
        arrayList.add(R.drawable.img9);
        arrayList.add(R.drawable.img10);

        ArrayAdapter adapter = new ArrayAdapter(KartikPicActivity.this, arrayList);
        listView.setAdapter(adapter);


    }
}