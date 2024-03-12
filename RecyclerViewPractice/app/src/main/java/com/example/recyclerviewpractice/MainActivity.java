package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Layout_Model> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerViewId);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Layout_Model(R.drawable.img, "Karan", "Prajapati"));
        arrayList.add(new Layout_Model(R.drawable.img1, "Sumit", "Kumar"));
        arrayList.add(new Layout_Model(R.drawable.img3, "Amit", "Singh"));
        arrayList.add(new Layout_Model(R.drawable.img4, "Nitish", "Shah"));
        arrayList.add(new Layout_Model(R.drawable.img5, "Suresh", "JIndal"));
        arrayList.add(new Layout_Model(R.drawable.img6, "Shesh", "Rana"));
        arrayList.add(new Layout_Model(R.drawable.img7, "Ganesh", "Bind"));
        arrayList.add(new Layout_Model(R.drawable.img9, "Mahesh", "Kumar"));
        arrayList.add(new Layout_Model(R.drawable.img10, "Dinesh", "Pandat"));
        arrayList.add(new Layout_Model(R.drawable.img11, "Jahi", "Tiwari"));
        arrayList.add(new Layout_Model(R.drawable.img12, "Anadi", "Bhadauriya"));
        arrayList.add(new Layout_Model(R.drawable.img13, "Anant", "Up"));
        arrayList.add(new Layout_Model(R.drawable.img14, "Akhand", "Gurjar"));
        arrayList.add(new Layout_Model(R.drawable.img15, "Ached", "Kulkarni"));
        arrayList.add(new Layout_Model(R.drawable.img16, "Abhed", "Singh"));


        RecycleAdapter adapter = new RecycleAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}