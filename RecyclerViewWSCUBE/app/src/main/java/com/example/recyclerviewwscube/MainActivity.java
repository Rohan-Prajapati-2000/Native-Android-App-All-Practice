package com.example.recyclerviewwscube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Recycle_Model> recycle_modelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerViewId);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img, "Sadhna Di", "Mummy se baat krwa do"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img1, "Karan Bro", "Nhi"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img2, "Sumit", "2 din baad aaunga"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img3, "Aryan", "Diwali ko aaoge ghar"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img4, "Amit Bhaiya", "Vimal ki shadi k liye ghar aaoge?"));
        recycle_modelArrayList.add(new Recycle_Model(R.drawable.img5, "Harsh", "Library me hu"));

        RecyclarAdapter adapter = new RecyclarAdapter(this, recycle_modelArrayList);
        recyclerView.setAdapter(adapter);

    }
}