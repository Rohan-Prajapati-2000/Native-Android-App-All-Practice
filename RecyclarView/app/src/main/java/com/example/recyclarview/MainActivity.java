package com.example.recyclarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        ContactModel model = new ContactModel(R.drawable.babypotato,"Babt Potato", "Spicy & Tasey");

        arrayList.add(new ContactModel(R.drawable.babypotato,"Baby Potato", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.chillipaneer,"Chilli Paneer", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.coinpotato,"Coin Potato", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.crispy,"Crispy", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.masalapasta,"Masala Pasta", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.masalapaw,"Masala Pav", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.potatofryrecipy,"Potato Fry Recipy", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.potatomasala,"Potato Masala", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.babypotato,"Baby Potato", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.chillipaneer,"Chilli Paneer", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.coinpotato,"Coin Potato", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.crispy,"Crispy", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.masalapasta,"Masala Pasta", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.masalapaw,"Masala Pav", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.potatofryrecipy,"Potato Fry Recipy", "Spicy & Tasey"));
        arrayList.add(new ContactModel(R.drawable.potatomasala,"Potato Masala", "Spicy & Tasey"));

        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);
    }
}