package com.example.cmtanvir.datepickdialoge;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView datepick;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepick = (TextView) findViewById(R.id.textId);
        button = (Button) findViewById(R.id.buttonId);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        DatePicker datePicker = new DatePicker(this);
        int currentDate = datePicker.getDayOfMonth();
        int currentMonth = datePicker.getMonth()+1;
        int currentYear = datePicker.getYear();
        datePickerDialog = new DatePickerDialog(this,


                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        datepick.setText(i2+"/"+i1+"/"+i);

                    }
                },currentDate,currentMonth,currentYear);
        datePickerDialog.show();

    }
}
