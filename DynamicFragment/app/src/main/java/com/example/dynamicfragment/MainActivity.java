package com.example.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static final String POP_FRAGMENT_TAG = "PopFragment";
private static final String ROOT_FRAGMENT_TAG = "RootFragment";
    Button btnChat, btnStatus, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChat=findViewById(R.id.btnChat);
        btnStatus=findViewById(R.id.btnStatus);
        btnCall=findViewById(R.id.btnCall);

        loadFragment(new ChatFragment(),0);

        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new ChatFragment(),1);
            }
        });

        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new StatusFragment(),1);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new CallFragment(),1);
            }
        });
    }

    public void loadFragment(Fragment fragment, int Flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (Flag==0) {
            fm.popBackStack(ROOT_FRAGMENT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE );
            ft.add(R.id.containerFrame, fragment);
            ft.addToBackStack(ROOT_FRAGMENT_TAG);

            // BY USING ABOVE TWO LINE IF WE OPENS FRAGMENT IN MULTIPLE LINE AND WHEN WO PRESS BACK BUTTON THEN
            // WHEN WE COMES AT HOME FRAGMENT THEN IT WILL REMOVE ALL BACK FRAGMENT FROM STACK AND
            //WHEN WE PRESS BACK BUTTON ON HOME FRAGMENT THEN IT WILL CLOSE APPLICATION
        }
        else {
            ft.replace(R.id.containerFrame, fragment);
            ft.addToBackStack(null);
        }
//        ft.addToBackStack(null);    // when we press back button then it will go one step back to activity
        ft.commit();
    }
}