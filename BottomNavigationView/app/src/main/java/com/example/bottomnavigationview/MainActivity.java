package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bnView);

        loadFragment(new HomeFragment(),true);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();

                if (id==R.id.nav_Home){
                    loadFragment(new HomeFragment(),false);
                } else if (id==R.id.nav_Search) {
                    loadFragment(new SearchFragment(), false);
                } else if (id==R.id.nav_New) {
                    loadFragment(new NewFragment(), false);
                } else if (id==R.id.nav_Contact) {
                    loadFragment(new ContactFragment(), false);
                }else {
                    loadFragment(new ProfileFragment(), false);
                }
                return true;
            }
        });
    }
    public void loadFragment(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag){
            ft.add(R.id.containerFrame, fragment);
        }else {
            ft.replace(R.id.containerFrame, fragment);
        }
        ft.commit();
    }
}