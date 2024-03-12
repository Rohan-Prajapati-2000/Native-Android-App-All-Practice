    package com.example.allpractice;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.widget.TextView;

    public class ThirdActivity extends AppCompatActivity {
    TextView stdInfo;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_third);

            stdInfo=findViewById(R.id.stdInfo);

            Intent fetchValue = getIntent();
            String name = fetchValue.getStringExtra("name");
            int rollNum = fetchValue.getIntExtra("rollNum", 0);
            stdInfo.setText("Name: "+ name + "\nRoll Number: "+rollNum);

        }
    }