package com.example.cmtanvir.mysptwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String[] countryNames;
    private  String [] population;

    private boolean isFirstSlection= true;

     int[] flags = {R.drawable.afghanistan,R.drawable.albania,R.drawable.bangladesh,R.drawable.bhutan,
            R.drawable.canada,R.drawable.denmark,R.drawable.england,
            R.drawable.india,R.drawable.pakistan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);
        population = getResources().getStringArray(R.array.population);

        spinner= (Spinner) findViewById(R.id.spinerId);

        CustomAdapter customAdapter = new CustomAdapter(this,flags,countryNames,population);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                 if(isFirstSlection==true){
                     isFirstSlection=false;
                 }
                else{

                     Toast.makeText(getApplicationContext(),countryNames[i]+"is Selected",Toast.LENGTH_SHORT).show();
                 }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
