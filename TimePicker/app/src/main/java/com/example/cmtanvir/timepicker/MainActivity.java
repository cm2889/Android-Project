package com.example.cmtanvir.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private Button button;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker =(TimePicker) findViewById(R.id.timeId);
        timePicker.setIs24HourView(true);
        button = (Button) findViewById(R.id.buttonId);
        textview =(TextView) findViewById(R.id.textId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                textview.setText(time);
            }
        });
    }
}
