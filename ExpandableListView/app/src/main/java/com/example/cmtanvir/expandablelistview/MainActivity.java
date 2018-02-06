package com.example.cmtanvir.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private CustomAdapter customAdapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private int lastexpandablePosition= -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Logo On action Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        // Compete aDD a Logo
        prepareListData();
        expandableListView = (ExpandableListView) findViewById(R.id.expandId);
        customAdapter= new CustomAdapter(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapter);
        // crete ongroup click listner to sow to header in click
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                String groupNmae= listDataHeader.get(i);
                Toast.makeText(getApplicationContext(),"Group Nmae: "+groupNmae,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //Ends Group Listner
        //Ongroup clopsed listner

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                String groupNmae= listDataHeader.get(i);
                Toast.makeText(getApplicationContext(),groupNmae+"Is collapsed ",Toast.LENGTH_SHORT).show();

            }
        });
        //Ends Clopsed Listner
        // child on click leastner
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                String childString = listDataChild.get(listDataHeader.get(i)).get(i);
                Toast.makeText(getApplicationContext(),childString,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Ends with child oN click listner
        // close last exapndable list view
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if(lastexpandablePosition!=-1&&lastexpandablePosition!=i)
                {
                    expandableListView.collapseGroup(lastexpandablePosition);
                }
                lastexpandablePosition= i;
            }
        });
        //close last expandable list view listner

    }
    // Start Preparelist method
    public void prepareListData(){
        String [] headerString= getResources().getStringArray(R.array.abberibation_headder);
        String [] childString= getResources().getStringArray(R.array.country_child);

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

      for(int i=0; i<headerString.length;i++)
      {
          // Add dataheader
          listDataHeader.add(headerString[i]);
          // add child
          List<String> child = new ArrayList<String>();
          child.add(childString[i]);
          listDataChild.put(listDataHeader.get(i),child);
      }
    }
    //Ending Prepare List methd
}
