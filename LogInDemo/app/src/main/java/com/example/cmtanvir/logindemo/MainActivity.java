package com.example.cmtanvir.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private EditText username, password;
    private TextView textView;
    private int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.userNameId);
        password = (EditText) findViewById(R.id.passwordId);
        loginbutton = (Button) findViewById(R.id.loginId);
        textView = (TextView) findViewById(R.id.textId);
        textView.setText("Number of Attemptes Remaning : 3 ");

        //Set leasner with LOGIN button
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("admin") && pass.equals("1234")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                    // Toast.makeText(MainActivity.this,"welcome",Toast.LENGTH_SHORT).show();
                } else {
                    count--;
                    textView.setText("Number of Attemptes Remaning :" + count);
                    if (count == 0) {
                        loginbutton.setEnabled(false);
                    }
                }
            }
        });
        //Close On Click Listener
    }
}
