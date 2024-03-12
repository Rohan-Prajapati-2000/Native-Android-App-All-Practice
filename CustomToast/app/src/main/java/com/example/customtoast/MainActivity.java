package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnShowToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowToast=findViewById(R.id.btnShowToast);

//        btnShowToast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This is Default Toast", Toast.LENGTH_SHORT).show();
//            }
//        });

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewContant));
                toast.setView(view);

                TextView txtView = view.findViewById(R.id.txtToast);
                txtView.setText("Your Message Has Been Sent Successfully");

                toast.setDuration(Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.CENTER, 0,0);    // By this Toast Will appear on the Center
//                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);      // By this toast will appear on the TOP LEFT
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT, 0,0);        //By this toast will appear Bottom Right
                toast.show();

            }
        });

    }
}