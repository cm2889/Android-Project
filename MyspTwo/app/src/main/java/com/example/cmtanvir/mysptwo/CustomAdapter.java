package com.example.cmtanvir.mysptwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cm Tanvir on 1/21/2018.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    private String[] countryNames;
    private  String [] population;
     int[] flags;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int[] flags, String[] countryNames, String[] population) {
        this.context = context;
        this.countryNames = countryNames;
        this.population = population;
        this.flags = flags;

    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null){

             LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
              view = inflater.inflate(R.layout.sample_view,null,false);
        }


        ImageView image = view.findViewById(R.id.imageId);
          image.setImageResource(flags[i]);

        TextView country = view.findViewById(R.id.textvide1Id);
        country.setText(countryNames[i]);
        TextView populationn = view.findViewById(R.id.text2Id);
        populationn.setText(population[i]);

        return view;
    }
}
