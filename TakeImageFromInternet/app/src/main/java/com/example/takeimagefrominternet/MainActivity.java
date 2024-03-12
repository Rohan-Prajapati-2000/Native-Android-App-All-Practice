package com.example.takeimagefrominternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView onlineimg1, onlineimg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineimg1=findViewById(R.id.imageView);
        onlineimg2=findViewById(R.id.imageView2);

        String uri = "https://openthemagazine.com/wp-content/uploads/2022/08/KartikAryan.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.loading_image).into(onlineimg1);

        Picasso.get().load("https://filmfare.wwmindia.com/content/2020/jun/karthikaryan71592906949.jpg").placeholder(R.drawable.loading_image).into(onlineimg2);
    }
}