package com.example.cmtanvir.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.settingId) {

            Toast.makeText(MainActivity.this, "Seeitng Is Selecte", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.shareId) {

            Toast.makeText(MainActivity.this, "Share Is Selecte", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.feedbackId) {

            Toast.makeText(MainActivity.this, "Feedback Is Selecte", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.feedbackId) {

            Toast.makeText(MainActivity.this, "About us Is Selecte", Toast.LENGTH_SHORT).show();
            return true;
        }

            return super.onOptionsItemSelected(item);
        }

}
