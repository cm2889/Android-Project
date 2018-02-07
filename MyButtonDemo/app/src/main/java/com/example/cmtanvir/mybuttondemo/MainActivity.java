package com.example.cmtanvir.mybuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button LoginButton,LogoutButton;
  private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = (Button) findViewById(R.id.logInId);
        LogoutButton = (Button) findViewById(R.id.logoutID);
        textView = (TextView) findViewById(R.id.textViewId);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d ("tag","log in button is Clicked");

               Toast toast= Toast.makeText(MainActivity.this,"Log in button is clicked",Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.CENTER,0,0);
               toast.show();

            }
        });

        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast= Toast.makeText(MainActivity.this,"Log Out button is clicked",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();

//            Toast kore kichu likha anbo as like as unistall
//                Log.d ("tag","log out button is Clicked");
            }
        });
    }
}
