package com.example.sharedpreference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
public class Adapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> arrayList;
    LayoutInflater layoutInflater;

    public Adapter(Context context, ArrayList arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        View view1= layoutInflater.inflate(R.layout.image_view_layout, viewGroup, false);
        ImageView imageView = view1.findViewById(R.id.imageView);
        imageView.setImageResource(arrayList.get(i));
        return view1;
    }
}
