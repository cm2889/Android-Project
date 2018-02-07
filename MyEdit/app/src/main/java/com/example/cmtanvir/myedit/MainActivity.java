package com.example.cmtanvir.myedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private EditText editText1,editText2;
    private Button addButton,subButton,multiplyButton,divisionButton;
    private TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.Text1ID);
        editText2 = (EditText) findViewById(R.id.Text2ID);
        addButton = (Button) findViewById(R.id.addButtonId);
        subButton = (Button) findViewById(R.id.subButtonId);
        multiplyButton = (Button) findViewById(R.id.mulButtonId);
        divisionButton = (Button) findViewById(R.id.divButtonId);
        resultView = (TextView) findViewById(R.id.resId);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        try{

            String number= editText1.getText().toString();
            String number2= editText2.getText().toString();

            //converting into double

            double num1 = Double.parseDouble(number);
            double num2 = Double.parseDouble(number2);

            if(view.getId()==R.id.addButtonId){
                double sum = num1+num2;
                resultView.setText("Result:   "+sum );
            }
            if (view.getId()==R.id.subButtonId){
                double sub = num1-num2;
                resultView.setText("Result:   "+sub );
            }
            if (view.getId()==R.id.mulButtonId){
                double mul = num1*num2;
                resultView.setText("Result:   "+mul );
            }
            if (view.getId()==R.id.divButtonId){
                double div = num1/num2;
                resultView.setText("Result:   "+div );
            }

        }
        catch ( Exception e ){
            Toast.makeText(MainActivity.this,"Please Enter Number ",Toast.LENGTH_SHORT).show();


        }





    }
}
