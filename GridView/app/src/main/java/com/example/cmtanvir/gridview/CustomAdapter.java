package com.example.cmtanvir.gridview;

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
     int [] flags;
     String [] countryNames;
     private LayoutInflater inflater;

     CustomAdapter( Context context, String[] countryNames, int[]flags){
         this.context=context;
         this.countryNames=countryNames;
         this.flags=flags;
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
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            view = inflater.inflate(R.layout.sample_view,viewGroup,false);

        }

         ImageView  imageView = (ImageView) view.findViewById(R.id.imageId);
        TextView textView =(TextView) view.findViewById(R.id.textId);
        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return view ;
    }


}
