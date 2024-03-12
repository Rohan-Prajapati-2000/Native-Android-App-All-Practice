package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    Context context;
    ArrayList<Layout_Model> arrContext;

    public RecycleAdapter(Context context, ArrayList<Layout_Model> arrContext) {
        this.context = context;
        this.arrContext = arrContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_xml_model,parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrContext.get(position).image);
        holder.txtName.setText(arrContext.get(position).name_one);
        holder.txtSecondName.setText(arrContext.get(position).name_second);

    }

    @Override
    public int getItemCount() {
        return arrContext.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtSecondName;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.firstName);
            txtSecondName=itemView.findViewById(R.id.secondName);
            img=itemView.findViewById(R.id.imgView);
        }
    }
}