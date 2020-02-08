package com.project.beaware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        String[] crimes = new String[]{"Drug Trafficking","Human Trafficking", "Fraud", "Kidnapping", "WildLike Poaching", "Sexual Harassment", "Illegal Trade", "Others"};

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_list, crimes);
        spinner.setAdapter(adapter);


    }
}
