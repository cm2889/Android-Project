package com.example.cmtanvir.feefbackoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class feedback extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton, clearButton;
    private EditText nameedit, messageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        sendButton = (Button) findViewById(R.id.sendButtonId);
        clearButton = (Button) findViewById(R.id.clearButtonId);
        nameedit = (EditText) findViewById(R.id.nameeditId);
        messageEdit = (EditText) findViewById(R.id.messageeditId);
        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try {
            String name = nameedit.getText().toString();
            String message = messageEdit.getText().toString();

            if (view.getId() == R.id.sendButtonId) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"imam2889@gmail.com", "imamtanvir95@yahoo.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feback form App");
                intent.putExtra(Intent.EXTRA_TEXT, "name:" + name + "\n Message: " + message);
                startActivity(Intent.createChooser(intent, "Feedback with"));

            } else if (view.getId() == R.id.clearButtonId) {
                nameedit.setText("");
                messageEdit.setText("");
            }


        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception: "+e,Toast.LENGTH_SHORT).show();

        }


    }
}
