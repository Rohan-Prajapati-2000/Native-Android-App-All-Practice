package com.example.recyclerviewpr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    AdapterRecycler adapterRecycler;
    FloatingActionButton btnAction;
ArrayList<ModelS> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        btnAction=findViewById(R.id.btnAction);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_layout);

                EditText etName, etState;
                Button btnAdd;

                etName = dialog.findViewById(R.id.etName);
                etState= dialog.findViewById(R.id.etState);
                btnAdd= dialog.findViewById(R.id.btnAdd);

                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = etName.getText().toString();
                        String state = etState.getText().toString();
                        if (name.isEmpty()){
                            etName.setError("Please Enter Name");
                        } else if (state.isEmpty()) {
                            etState.setError("Please Enter State");
                        } else{
                            arrayList.add(new ModelS(name,state));
                            adapterRecycler.notifyItemInserted(arrayList.size()-1);
                            recyclerView.scrollToPosition(arrayList.size()-1);
                            dialog.dismiss();  // by this dialog will dismiss after adding the value
                        }
                    }
                });
                dialog.show();

            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        arrayList.add(new ModelS(R.drawable.img, "Naman", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img1, "Raman", "UttraKhand"));
        arrayList.add(new ModelS(R.drawable.img2, "Karan", "UttarPradesh"));
        arrayList.add(new ModelS(R.drawable.img3, "Dharam", "Nagaland"));
        arrayList.add(new ModelS(R.drawable.img4, "Varun", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img5, "Aryan", "Karnatak"));
        arrayList.add(new ModelS(R.drawable.img6, "Aditya", "Banguluru"));
        arrayList.add(new ModelS(R.drawable.img7, "Amit", "Gujrat"));
        arrayList.add(new ModelS(R.drawable.img8, "Rohit", "Himanchal Pradesh"));
        arrayList.add(new ModelS(R.drawable.img9, "Mohit", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img10, "Sohit", "Haryana"));
        arrayList.add(new ModelS(R.drawable.img11, "Akash", "Madhya Pradesh"));
        arrayList.add(new ModelS(R.drawable.img12, "Vikas", "Uttar Pradesh"));
        arrayList.add(new ModelS(R.drawable.img13, "Sumit", "Pune"));
        arrayList.add(new ModelS(R.drawable.img14, "Adarsh", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img15, "Aman", "Asam"));
        arrayList.add(new ModelS(R.drawable.img, "Naman", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img1, "Raman", "UttraKhand"));
        arrayList.add(new ModelS(R.drawable.img2, "Karan", "UttarPradesh"));
        arrayList.add(new ModelS(R.drawable.img3, "Dharam", "Nagaland"));
        arrayList.add(new ModelS(R.drawable.img4, "Varun", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img5, "Aryan", "Karnatak"));
        arrayList.add(new ModelS(R.drawable.img6, "Aditya", "Banguluru"));
        arrayList.add(new ModelS(R.drawable.img7, "Amit", "Gujrat"));
        arrayList.add(new ModelS(R.drawable.img8, "Rohit", "Himanchal Pradesh"));
        arrayList.add(new ModelS(R.drawable.img9, "Mohit", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img10, "Sohit", "Haryana"));
        arrayList.add(new ModelS(R.drawable.img11, "Akash", "Madhya Pradesh"));
        arrayList.add(new ModelS(R.drawable.img12, "Vikas", "Uttar Pradesh"));
        arrayList.add(new ModelS(R.drawable.img13, "Sumit", "Pune"));
        arrayList.add(new ModelS(R.drawable.img14, "Adarsh", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img15, "Aman", "Asam"));

        arrayList.add(new ModelS(R.drawable.img, "Naman", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img1, "Raman", "UttraKhand"));
        arrayList.add(new ModelS(R.drawable.img2, "Karan", "UttarPradesh"));
        arrayList.add(new ModelS(R.drawable.img3, "Dharam", "Nagaland"));
        arrayList.add(new ModelS(R.drawable.img4, "Varun", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img5, "Aryan", "Karnatak"));
        arrayList.add(new ModelS(R.drawable.img6, "Aditya", "Banguluru"));
        arrayList.add(new ModelS(R.drawable.img7, "Amit", "Gujrat"));
        arrayList.add(new ModelS(R.drawable.img8, "Rohit", "Himanchal Pradesh"));
        arrayList.add(new ModelS(R.drawable.img9, "Mohit", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img10, "Sohit", "Haryana"));
        arrayList.add(new ModelS(R.drawable.img11, "Akash", "Madhya Pradesh"));
        arrayList.add(new ModelS(R.drawable.img12, "Vikas", "Uttar Pradesh"));
        arrayList.add(new ModelS(R.drawable.img13, "Sumit", "Pune"));
        arrayList.add(new ModelS(R.drawable.img14, "Adarsh", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img15, "Aman", "Asam"));
        arrayList.add(new ModelS(R.drawable.img, "Naman", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img1, "Raman", "UttraKhand"));
        arrayList.add(new ModelS(R.drawable.img2, "Karan", "UttarPradesh"));
        arrayList.add(new ModelS(R.drawable.img3, "Dharam", "Nagaland"));
        arrayList.add(new ModelS(R.drawable.img4, "Varun", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img5, "Aryan", "Karnatak"));
        arrayList.add(new ModelS(R.drawable.img6, "Aditya", "Banguluru"));
        arrayList.add(new ModelS(R.drawable.img7, "Amit", "Gujrat"));
        arrayList.add(new ModelS(R.drawable.img8, "Rohit", "Himanchal Pradesh"));
        arrayList.add(new ModelS(R.drawable.img9, "Mohit", "Mumbai"));
        arrayList.add(new ModelS(R.drawable.img10, "Sohit", "Haryana"));
        arrayList.add(new ModelS(R.drawable.img11, "Akash", "Madhya Pradesh"));
        arrayList.add(new ModelS(R.drawable.img12, "Vikas", "Uttar Pradesh"));
        arrayList.add(new ModelS(R.drawable.img13, "Sumit", "Pune"));
        arrayList.add(new ModelS(R.drawable.img14, "Adarsh", "Delhi"));
        arrayList.add(new ModelS(R.drawable.img15, "Aman", "Asam"));

        adapterRecycler = new AdapterRecycler(MainActivity.this, arrayList);
        recyclerView.setAdapter(adapterRecycler);


    }
}