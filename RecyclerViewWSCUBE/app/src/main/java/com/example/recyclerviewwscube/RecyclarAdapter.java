package com.example.recyclerviewwscube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kotlin.reflect.KParameter;

public class RecyclarAdapter extends RecyclerView.Adapter<RecyclarAdapter.ViewHolder> {
    Context context;
    ArrayList<Recycle_Model> arrContext;
    public RecyclarAdapter(Context context, ArrayList<Recycle_Model> arrContext) {
        this.context = context;
        this.arrContext = arrContext;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_model, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrContext.get(position).img);
        holder.txtName.setText(arrContext.get(position).name);
        holder.txtContact.setText(arrContext.get(position).contact);
    }
    @Override
    public int getItemCount() {return arrContext.size();}
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtContact;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.name);
            txtContact = itemView.findViewById(R.id.contactNumber);
            imageView = itemView.findViewById(R.id.img);
        }
    }
}
