package com.example.listpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<Model> arrContext;

    public RecyclerContactAdapter(Context context, ArrayList<Model> arrContext) {
        this.context = context;
        this.arrContext = arrContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrContext.get(position).img);
        holder.txtName.setText(arrContext.get(position).name);
        holder.txtContact.setText(arrContext.get(position).contact);
    }

    @Override
    public int getItemCount() {
        return arrContext.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtContact;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtContact = itemView.findViewById(R.id.txtContact);
            img=itemView.findViewById(R.id.model_Image);
        }
    }
}
