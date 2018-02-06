package com.example.cmtanvir.expandablelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Cm Tanvir on 1/27/2018.
 */

public class CustomAdapter extends BaseExpandableListAdapter {
    private Context context;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    public CustomAdapter(Context context, List<String> listDataHeader, HashMap<String, List<String>> listDataChild) {
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listDataChild = listDataChild;
    }

    @Override
    public int getGroupCount() {
        return this.listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listDataChild.get(listDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listDataChild.get(listDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerText = (String) getGroup(i);

        if(view==null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view= inflater.inflate(R.layout.group_layout,null);

        }
         TextView textView= view.findViewById(R.id.headerId);
        textView.setText(headerText);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String childText = (String) getChild(i,i1);

        if(view==null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.child_layout,null);

        }
        TextView textView= view.findViewById(R.id.childId);
        textView.setText(childText);
        return view;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
