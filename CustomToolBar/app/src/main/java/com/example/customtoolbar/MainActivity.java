package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

        // Step 1
        setSupportActionBar(toolbar);

        // Step 2
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setTitle("My ToolBar");
        toolbar.setSubtitle("Subtitle");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        
        if(itemId==R.id.opt_new){
            Toast.makeText(this, "Create New File", Toast.LENGTH_SHORT).show();
        } else if (itemId==R.id.opt_open) {
            Toast.makeText(this, "Opening New File", Toast.LENGTH_SHORT).show();
        } else if (itemId==android.R.id.home) {
            super.onBackPressed();
        }else {
            Toast.makeText(this, "Saving...", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}