package com.example.cmtanvir.progressbar;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    int progrss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove The Title Bar

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Remove The notification Bar

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWordk();
            }
        });
        thread.start();
    }
     public void doWordk(){

  for(progrss=10;progrss<=100;progrss=progrss+10){

      try {
          Thread.sleep(1000);
          progressBar.setProgress(progrss);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }

     }

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
