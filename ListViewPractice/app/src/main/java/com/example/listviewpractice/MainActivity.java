package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Display;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<Model> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        arrayList.add(new Model(R.drawable.img));
        arrayList.add(new Model(R.drawable.img1));
        arrayList.add(new Model(R.drawable.img2));
        arrayList.add(new Model(R.drawable.img3));
        arrayList.add(new Model(R.drawable.img4));
        arrayList.add(new Model(R.drawable.img5));
        arrayList.add(new Model(R.drawable.img6));
        arrayList.add(new Model(R.drawable.img7));
        arrayList.add(new Model(R.drawable.img8));
        arrayList.add(new Model(R.drawable.img9));
        arrayList.add(new Model(R.drawable.img10));
        arrayList.add(new Model(R.drawable.img11));
        arrayList.add(new Model(R.drawable.img12));
        arrayList.add(new Model(R.drawable.img13));
        arrayList.add(new Model(R.drawable.img14));
        arrayList.add(new Model(R.drawable.img16));
        arrayList.add(new Model(R.drawable.img17));
        arrayList.add(new Model(R.drawable.img18));
        arrayList.add(new Model(R.drawable.img19));
        arrayList.add(new Model(R.drawable.img20));
        arrayList.add(new Model(R.drawable.img21));
        arrayList.add(new Model(R.drawable.img22));
        arrayList.add(new Model(R.drawable.img23));
        arrayList.add(new Model(R.drawable.img24));

        ImageAdapter adapter = new ImageAdapter(this, arrayList);
        listView.setAdapter(adapter);

    }
}

