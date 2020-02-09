package com.project.beaware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Pie;
import com.anychart.anychart.ValueDataEntry;
import com.project.beaware.model.Crime;
import com.project.beaware.services.CrimeServices;
import com.project.beaware.services.ServiceBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CrimeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    CrimeServices crimeServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        Spinner spinner = findViewById(R.id.crime_spinner);
        String[] stringArray = {"Crime", "Location"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_list, stringArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        ServiceBuilder.buildService(CrimeServices.class);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String getItemSelected = adapterView.getItemAtPosition(i).toString();

            if(getItemSelected.equals("Crime")){
                Pie pie = AnyChart.pie();

                List<DataEntry> data = new ArrayList<>();
                data.add(new ValueDataEntry("Drug Trafficking", 1));
                data.add(new ValueDataEntry("Human Trafficking",100 ));
                data.add(new ValueDataEntry("Fraud", 180));
                data.add(new ValueDataEntry("Kidnapping", 200));
                data.add(new ValueDataEntry("Wildlife Poaching", 300));
                data.add(new ValueDataEntry("Sexual Harrasment", 200));
                data.add(new ValueDataEntry("Illegal Trade", 500));
                data.add(new ValueDataEntry("Others", 150));

                AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
                anyChartView.setChart(pie);

            }else{
                Pie pie = AnyChart.pie();

                List<DataEntry> data = new ArrayList<>();
                data.add(new ValueDataEntry("North-Central", 1));
                data.add(new ValueDataEntry("North-West",100 ));
                data.add(new ValueDataEntry("North-East", 180));
                data.add(new ValueDataEntry("South-South", 200));
                data.add(new ValueDataEntry("South-East", 300));
                data.add(new ValueDataEntry("South-West", 200));


                AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
                anyChartView.setChart(pie);

            }



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
