package com.example.cmtanvir.feefbackoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Crete Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }
// Option Menu Selescted
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Feedback Page
        if (item.getItemId() == R.id.feedbackId) {
            Intent intent = new Intent(getApplicationContext(), feedback.class);
            startActivity(intent);
        }
        // Share Page With Send Button and Clear Button
        else if (item.getItemId() == R.id.shareId) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "C programming App";
            String body = "This help is very useful for learn C programming";

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);
            startActivity(Intent.createChooser(intent, " Share With "));
        }
        // About Page
         else if (item.getItemId() == R.id.aboutId) {
            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
