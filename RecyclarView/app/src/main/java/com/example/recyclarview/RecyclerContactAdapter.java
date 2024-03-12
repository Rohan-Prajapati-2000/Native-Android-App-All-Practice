package com.example.recyclarview;

import android.content.Context;
import android.media.Image;
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
    ArrayList<ContactModel> arrayList;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgContact.setImageResource(arrayList.get(position).img);
        holder.txtName.setText(arrayList.get(position).name);
        holder.txtSubname.setText(arrayList.get(position).subname);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName, txtSubname;
        ImageView imgContact;

        public ViewHolder(View itemView){
            super(itemView);

            txtName=itemView.findViewById(R.id.messageTxt);
            txtSubname=itemView.findViewById(R.id.subMessageTxt);
            imgContact=itemView.findViewById(R.id.imgContact);


        }

    }
}
