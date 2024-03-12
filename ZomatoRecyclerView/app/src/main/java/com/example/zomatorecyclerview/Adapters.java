package com.example.zomatorecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapters extends RecyclerView.Adapter<Adapters.viewHolder>{

    ArrayList<Models> arrayList;
    Context context;

    public Adapters(ArrayList<Models> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.structure, parent, false);
        viewHolder viewHolder=new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Models model = arrayList.get(position);
        holder.img.setImageResource(model.getImg());
        holder.restorentName.setText(model.getrName());
        holder.foodDetail.setText(model.getfName());
        holder.deliveryTime.setText(model.gettDetail());
        
//        holder.img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "You Clicked On Image", Toast.LENGTH_SHORT).show();
//            }
//        });

        switch(position){
            case 0:
                holder.img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Image One Is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.restorentName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "First Restorent Is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.foodDetail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1 You Clicked Food Detail", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.deliveryTime.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1 You clicked delivery time", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 1:
                holder.img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Image Two Is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.restorentName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Second Restorent Is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.foodDetail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2 You Clicked Food Detail", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.deliveryTime.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2 You clicked delivery time", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
                break;
        }


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView restorentName, foodDetail, deliveryTime;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            restorentName=itemView.findViewById(R.id.restorentName);
            foodDetail=itemView.findViewById(R.id.foodTypeAndPrice);
            deliveryTime=itemView.findViewById(R.id.durationAndDistance);
        }
    }
}
