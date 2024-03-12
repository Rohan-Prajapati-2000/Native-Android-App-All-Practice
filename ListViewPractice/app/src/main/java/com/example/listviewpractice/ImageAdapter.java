package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    Context context;
    ArrayList<Model> imageList;
    // this ArrayList depend on Model class and get all value in imageList variable


    public ImageAdapter(Context context, ArrayList<Model> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.image_view_layout, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        Model model =imageList.get(i);
        imageView.setImageResource(model.getImg());

        return view;
    }
}
