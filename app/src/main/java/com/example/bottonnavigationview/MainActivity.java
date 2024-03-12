package com.example.bottonnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.listimagepractice.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bmView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();

                if(id==R.id.nav_home){
                    loadFragment(new HomeFragment());
                } else if (id==R.id.nav_search) {
                    loadFragment(new SearchFragment());
                } else if (id==R.id.nav_new) {
                    loadFragment(new NewFragment());
                } else if (id==R.id.nav_contactUs) {
                    loadFragment(new ContactUsFragment());
                }else {
                    loadFragment(new ProfileFragment());
                }
                return true;
            }
        });

    }
    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.ContainerFrag,fragment);
        ft.commit();
    }
}