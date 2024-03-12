package com.example.customalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button oneBtnAlert, twoBtnAlert, threeBtnAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneBtnAlert=findViewById(R.id.oneBtnAlert);
        twoBtnAlert=findViewById(R.id.twoBtnAlert);
        threeBtnAlert=findViewById(R.id.threeBtnAlert);

        //Single Button Dialog Box
        oneBtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Terms & Condition");
                alertDialog.setIcon(R.drawable.baseline_info_24);
                alertDialog.setMessage("Have you read all the T & C");

                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes, I'have Read", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Yes you can proceed now", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });

        twoBtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder deldialog = new AlertDialog.Builder(MainActivity.this);

                deldialog.setTitle("Delete");
                deldialog.setIcon(R.drawable.baseline_delete_24);
                deldialog.setMessage("Are you sure want to delete?");

                deldialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
                    }
                });

                deldialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Item Not Deleted", Toast.LENGTH_SHORT).show();
                    }
                });
                deldialog.show();
            }
        });

        threeBtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder exitDialog = new AlertDialog.Builder(MainActivity.this);

                exitDialog.setTitle("Exit");
                exitDialog.setMessage("Are you sure want to exit?");
                exitDialog.setIcon(R.drawable.baseline_exit_to_app_24);

                exitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                });

                exitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
                    }
                });

                exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Cancel Program", Toast.LENGTH_SHORT).show();
                    }
                });
                exitDialog.show();
            }
        });


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder exitDialog = new AlertDialog.Builder(MainActivity.this);

        exitDialog.setTitle("Exit");
        exitDialog.setMessage("Are you sure want to exit");
        exitDialog.setIcon(R.drawable.baseline_exit_to_app_24);

        exitDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });

        exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.show();
    }
}