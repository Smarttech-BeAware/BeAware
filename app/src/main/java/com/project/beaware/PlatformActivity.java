package com.project.beaware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PlatformActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platform);

        Spinner spinner = findViewById(R.id.category_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout


        List<String> platformList = new ArrayList<>();
        platformList.add("Job Agency");
        platformList.add("Finance");
        platformList.add("Investment");
        platformList.add("Entertainment");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_list, platformList);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
