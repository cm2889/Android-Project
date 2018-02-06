package com.example.cmtanvir.countryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button bangladesh;
    private Button india;
    private Button pakistan;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove Titrle Bar

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Remove Notificationa and full Screen

getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //Logo On action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.bangladesh);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        // Compete aDD a Logo

        bangladesh= (Button) findViewById(R.id.bang1Id);
        india= (Button) findViewById(R.id.indiaId);
        pakistan= (Button) findViewById(R.id.pakId);
        bangladesh.setOnClickListener(this);
        india.setOnClickListener(this);
        pakistan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.bang1Id){

             intent  = new Intent(MainActivity.this,ProfileActivity.class);
             intent.putExtra("name","bangladesh");
             startActivity(intent);
        }
        if(view.getId()==R.id.indiaId){

            intent  = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(view.getId()==R.id.pakId){

            intent  = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder aler;
        aler = new AlertDialog.Builder(MainActivity.this);
        aler.setIcon(R.drawable.exit);
        aler.setTitle("This is Title");
        aler.setMessage("Do you want to exit");
        aler.setCancelable(false);
        aler.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        aler.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.cancel();
            }
        });
        aler.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = aler.create();
        alertDialog.show();
    }
}
