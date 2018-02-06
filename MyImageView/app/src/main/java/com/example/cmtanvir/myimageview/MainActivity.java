package com.example.cmtanvir.myimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.imageview1Id);
        imageView2 = (ImageView) findViewById(R.id.imageview2ID);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageview1Id) {
            Toast.makeText(MainActivity.this," Jump done",Toast.LENGTH_SHORT).show();
        }
       else if (view.getId()==R.id.imageview2ID){
            Toast.makeText(MainActivity.this," Ammu  with me",Toast.LENGTH_SHORT).show();
        }
    }
}
