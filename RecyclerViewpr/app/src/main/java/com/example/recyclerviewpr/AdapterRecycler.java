package com.example.recyclerviewpr;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {

    Context context;
    ArrayList<ModelS> arrayContext;
public AdapterRecycler(Context context, ArrayList<ModelS> arrayContext) {
    this.context = context;
    this.arrayContext = arrayContext;
}    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_model, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(arrayContext.get(position).img);
        holder.txtName.setText(arrayContext.get(position).name);
        holder.txtState.setText(arrayContext.get(position).state);

        holder.linearItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_update_layout);

                TextView txtStatus;
                EditText etName, etState;
                Button btnUpdate;
                etName = dialog.findViewById(R.id.etName);
                etState = dialog.findViewById(R.id.etState);
                btnUpdate=dialog.findViewById(R.id.btnAdd);
                txtStatus=dialog.findViewById(R.id.txtStatus);

                btnUpdate.setText("Update");
                txtStatus.setText("Update Contact");

                etName.setText((arrayContext.get(position)).name);
                etState.setText((arrayContext.get(position)).state);


                btnUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String name, state;

                        if (etName.getText().toString().equals("")){
                            etName.setError("Please Enter Name");
                        } else if (etState.getText().toString().equals("")) {
                            etState.setError("Please Enter Contact Number");
                        }else {

                        }
                    }
                });


            }
        });
    }
    @Override
    public int getItemCount() {
        return arrayContext.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtState;
    ImageView image;
    LinearLayout linearItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtState = itemView.findViewById(R.id.txtState);
            image = itemView.findViewById(R.id.imageView);
            linearItem=itemView.findViewById(R.id.linearItem);

        }
    }
}
