package com.example.cmtanvir.clock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock textClock;
    private DigitalClock digitalClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = (AnalogClock) findViewById(R.id.anlogId);
        digitalClock = (DigitalClock) findViewById(R.id.digitakId);
        textClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.anlogId){
            Toast.makeText(MainActivity.this,"Analog Clock is Clicke",Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.digitakId){
            Toast.makeText(MainActivity.this,"Digital Clock is Clicke",Toast.LENGTH_SHORT).show();
        }

    }
}
