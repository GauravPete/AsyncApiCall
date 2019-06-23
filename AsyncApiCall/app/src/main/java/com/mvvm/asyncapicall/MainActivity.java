package com.mvvm.asyncapicall;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context= this;
    Button getData;
    TextView displayData;

    // Step 1 : Create the UI releted stub for display the data
    // Step 2 : Create the class for baground task e.g. we create the BagroundTask.java


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initUI() {
        getData=findViewById(R.id.btn_get_data);
        displayData = findViewById(R.id.txt_display_data);

    }
}
