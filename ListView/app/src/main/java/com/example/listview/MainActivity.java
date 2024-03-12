package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView stateName;

    String cities[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana",
            "Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra",
            "Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana",
            "Tripura","Uttarakhand","Uttar Pradesh","West Bengal","Andaman and Nicobar Islands","Chandigarh",
            "Dadra and Nagar Haveli","Daman and Diu","Delhi","Lakshadweep","Puducherry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stateName=findViewById(R.id.tvStateName);
        listView=findViewById(R.id.listVeiw);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Clicked "+ cities[i], Toast.LENGTH_SHORT).show();
                stateName.setText(cities[i]);
            }
        });



    }
}

//FOR SET ARRAY IN DROPDOWN LIST

////XML
//<Spinner
//    android:id="@+id/spinner"
//            android:layout_width="match_parent"
//            android:layout_height="wrap_content" />
//
////MAINACTIVITY
//public class MainActivity extends AppCompatActivity {
//    Spinner spinner;
//    TextView stateName;
//
//    String cities[] = {"Andhra Pradesh", "Arunachal Pradesh", /* ... add all cities ... */};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        stateName = findViewById(R.id.tvStateName);
//        spinner = findViewById(R.id.spinner);
//
//        // Create an ArrayAdapter for the Spinner
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cities);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // Set the ArrayAdapter on the Spinner
//        spinner.setAdapter(adapter);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                String selectedCity = cities[i];
//                Toast.makeText(MainActivity.this, "Selected " + selectedCity, Toast.LENGTH_SHORT).show();
//                stateName.setText(selectedCity);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//                // Handle no selection if needed.
//            }
//        });
//    }
//}
