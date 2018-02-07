package com.example.cmtanvir.mycheckbox;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milk,sugar,water;
    private Button result;
    private TextView title,res;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milk = (CheckBox) findViewById(R.id.milkId);
        sugar = (CheckBox) findViewById(R.id.sugarId);
        water = (CheckBox) findViewById(R.id.waterId);
        result = (Button) findViewById(R.id.buttonId);
        title =(TextView) findViewById(R.id.titleId);
        res = (TextView) findViewById(R.id.rsultId);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milk.isChecked()){

                    String value = milk.getText().toString();

                    stringBuilder.append(value + " is ordered"+"\n");
                }
                if(water.isChecked()){

                    String value = water.getText().toString();

                    stringBuilder.append(value + " is ordered"+"\n");
                }
                if(sugar.isChecked()){

                    String value = sugar.getText().toString();

                    stringBuilder.append(value + " is ordered"+"\n");
                }
                res
                        .setText(stringBuilder);
            }
        });
    }
}
