package com.example.imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView imgView;
ArrayList<Integer> arrayList = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView=findViewById(R.id.imgView);

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

        ListAdapter adapter = new ListAdapter(MainActivity.this, arrayList);
        imgView.setAdapter(adapter);

    }
}