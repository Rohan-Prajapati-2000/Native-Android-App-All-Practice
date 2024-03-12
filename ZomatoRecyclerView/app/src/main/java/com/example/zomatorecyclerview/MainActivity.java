package com.example.zomatorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList <Models> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclarViews);




        list.add(new Models(R.drawable.babypotato, "KFC", "Fast Food . Baby Potato . ₹200 for one", "30-45 min 5km"));
        list.add(new Models(R.drawable.chillipaneer, "Burger King", "Fast Food . Chilli Paneer . ₹200 for one", "30-40 min 5km"));
        list.add(new Models(R.drawable.chillipotato, "Delhi-Di-Hatti", "Fast Food . Chilli Potato . ₹200 for one", "15-20 min 2km"));
        list.add(new Models(R.drawable.crispy, "Burger King", "Fast Food . Crispy . ₹200 for one", "20-30 min 3km"));
        list.add(new Models(R.drawable.masalapasta, "Apni Rasoi", "Fast Food . Masala Pasta . ₹200 for one", "30-45 min 5km"));
        list.add(new Models(R.drawable.masalapaw, "Burger King", "Fast Food . Masala Paw . ₹200 for one", "45 min 8km"));
        list.add(new Models(R.drawable.potatofryrecipy, "Apna Bhojnalaya", "Fast Food . Potato Fry Recipe . ₹200 for one", "40-45 min 10km"));
        list.add(new Models(R.drawable.potatomasala, "Burger King", "Fast Food . Potato Masala . ₹200 for one", "15-20 min 1km"));
        list.add(new Models(R.drawable.babypotato, "KFC", "Fast Food . Baby Potato . ₹200 for one", "30-45 min 5km"));
        list.add(new Models(R.drawable.chillipaneer, "Burger King", "Fast Food . Chilli Paneer . ₹200 for one", "30-40 min 5km"));
        list.add(new Models(R.drawable.chillipotato, "Delhi-Di-Hatti", "Fast Food . Chilli Potato . ₹200 for one", "15-20 min 2km"));
        list.add(new Models(R.drawable.crispy, "Burger King", "Fast Food . Crispy . ₹200 for one", "20-30 min 3km"));
        list.add(new Models(R.drawable.masalapasta, "Apni Rasoi", "Fast Food . Masala Pasta . ₹200 for one", "30-45 min 5km"));
        list.add(new Models(R.drawable.masalapaw, "Burger King", "Fast Food . Masala Paw . ₹200 for one", "45 min 8km"));
        list.add(new Models(R.drawable.potatofryrecipy, "Apna Bhojnalaya", "Fast Food . Potato Fry Recipe . ₹200 for one", "40-45 min 10km"));
        list.add(new Models(R.drawable.potatomasala, "Burger King", "Fast Food . Potato Masala . ₹200 for one", "15-20 min 1km"));


        //        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));     // It will show in Vertical form

//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));        // It will show in Horizontal form

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);       //It will show in grid form
//        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggered);

        Adapters adapters= new Adapters(list,this);
        recyclerView.setAdapter(adapters);

    }
}