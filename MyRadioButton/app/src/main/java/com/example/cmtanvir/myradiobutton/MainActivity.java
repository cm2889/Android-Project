package com.example.cmtanvir.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button show;
    private RadioButton genderButtton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroupId);
        show = (Button) findViewById(R.id.buttonId);
        result = (TextView) findViewById(R.id.resultId);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderButtton = (RadioButton) findViewById(selectedId);
                 String value = genderButtton.getText().toString();
                 result.setText(" You are selected " +value+ "  button");

            }
        });
    }
}
