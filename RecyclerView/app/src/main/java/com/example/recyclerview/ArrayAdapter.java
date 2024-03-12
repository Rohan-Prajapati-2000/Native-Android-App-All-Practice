package com.example.recyclerview;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {
Context context;
ArrayList<Model> arrayContext;

    public ArrayAdapter(Context context, ArrayList<Model> arrayContext) {
        this.context = context;
        this.arrayContext = arrayContext;
    }

    @NonNull
    @Override
    public ArrayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArrayAdapter.ViewHolder holder, int position) {
        holder.txtName.setText(arrayContext.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrayContext.size();
    }

    public void addName(String newData){
        arrayContext.add(new Model(newData));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
        }
    }
}
