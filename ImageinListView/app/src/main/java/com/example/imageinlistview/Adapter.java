package com.example.imageinlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter{
Context context;
ArrayList<Model> imageList;
    public Adapter(Context context, ArrayList<Model> imageList) {
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

        if (view== null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }
        ImageView imageView= view.findViewById(R.id.imagePreviewFromXmlFile);
        Model model = imageList.get(i);
        imageView.setImageResource(model.getImg());
        return view;
    }
}

