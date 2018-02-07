package com.example.cmtanvir.datepick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView text;
    private Button selectbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = (DatePicker) findViewById(R.id.datePickId);
        text = (TextView) findViewById(R.id.dateId);
        selectbutton =(Button) findViewById(R.id.submitId);

        text.setText(currentDate());
        selectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(currentDate());
            }
        });
    }

    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Today's Date: ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear()+"");

         return stringBuilder.toString();
    }
}
