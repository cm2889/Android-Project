package com.example.cmtanvir.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    String [] countryNames;


    private int[] flags = {R.drawable.afghanistan,R.drawable.albania,R.drawable.bangladesh,R.drawable.bhutan,
            R.drawable.canada,R.drawable.denmark,R.drawable.england,
            R.drawable.india,R.drawable.pakistan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = (GridView) findViewById(R.id.gridviewId);
        countryNames=getResources().getStringArray(R.array.country_names);


        final CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String  value= countryNames[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });




    }
}
