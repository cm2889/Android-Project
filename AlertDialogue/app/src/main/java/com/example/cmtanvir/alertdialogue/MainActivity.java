package com.example.cmtanvir.alertdialogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button exitButton;
    private AlertDialog.Builder alertd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitButton = (Button) findViewById(R.id.buttonId);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        alertd = new AlertDialog.Builder(MainActivity.this);

        //for setting titile

        alertd.setTitle(R.string.title);
        // for setting message
        alertd.setMessage(R.string.message);

        // for setting Icon
        alertd.setIcon(R.drawable.alert);
        //set postitive button

        alertd.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              //exit
                finish();
            }
        });
        alertd.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               // Toast.makeText(MainActivity.this,"You are Clicked No buttons",Toast.LENGTH_SHORT).show();
                // kono kaj hobe na jei khane achi sei khane thakbo
                dialogInterface.cancel();
            }
        });
        alertd.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"You are Clicked Cancel buttons",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertd.create();
        alertDialog.show();
    }
}
