package com.example.imageinlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView imgListView;

ArrayList<Model> arrayImageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgListView=findViewById(R.id.listView);

        arrayImageList.add(new Model(R.drawable.abc));
        arrayImageList.add(new Model(R.drawable.editing));
        arrayImageList.add(new Model(R.drawable.glow_effect));
        arrayImageList.add(new Model(R.drawable.halfton_effect));
        arrayImageList.add(new Model(R.drawable.photo));
        arrayImageList.add(new Model(R.drawable.photo_abc));
        arrayImageList.add(new Model(R.drawable.photo_adfkja));
        arrayImageList.add(new Model(R.drawable.photo_ajdjf));
        arrayImageList.add(new Model(R.drawable.photo_akdjf));
        arrayImageList.add(new Model(R.drawable.photo_jdfa));
        arrayImageList.add(new Model(R.drawable.pic_resized));

        arrayImageList.add(new Model(R.drawable.abc));
        arrayImageList.add(new Model(R.drawable.editing));
        arrayImageList.add(new Model(R.drawable.glow_effect));
        arrayImageList.add(new Model(R.drawable.halfton_effect));
        arrayImageList.add(new Model(R.drawable.photo));
        arrayImageList.add(new Model(R.drawable.photo_abc));
        arrayImageList.add(new Model(R.drawable.photo_adfkja));
        arrayImageList.add(new Model(R.drawable.photo_ajdjf));
        arrayImageList.add(new Model(R.drawable.photo_akdjf));
        arrayImageList.add(new Model(R.drawable.photo_jdfa));
        arrayImageList.add(new Model(R.drawable.pic_resized));

        arrayImageList.add(new Model(R.drawable.abc));
        arrayImageList.add(new Model(R.drawable.editing));
        arrayImageList.add(new Model(R.drawable.glow_effect));
        arrayImageList.add(new Model(R.drawable.halfton_effect));
        arrayImageList.add(new Model(R.drawable.photo));
        arrayImageList.add(new Model(R.drawable.photo_abc));
        arrayImageList.add(new Model(R.drawable.photo_adfkja));
        arrayImageList.add(new Model(R.drawable.photo_ajdjf));
        arrayImageList.add(new Model(R.drawable.photo_akdjf));
        arrayImageList.add(new Model(R.drawable.photo_jdfa));
        arrayImageList.add(new Model(R.drawable.pic_resized));

//        Adapter adapter= new Adapter(this ,arrayImageList);
        Adapter adapter = new Adapter(this, arrayImageList);
        imgListView.setAdapter(adapter);

    }
}
