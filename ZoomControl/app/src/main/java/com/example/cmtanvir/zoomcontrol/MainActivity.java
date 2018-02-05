package com.example.cmtanvir.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView) findViewById(R.id.imageId);
        zoomControls = (ZoomControls) findViewById(R.id.zoomId);


        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Zoom In",Toast.LENGTH_SHORT).show();

               float x = imageView.getScaleX();
               float y = imageView.getScaleY();

               imageView.setScaleX((float) x+1);
               imageView.setScaleY((float) y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Zoom Out", Toast.LENGTH_SHORT).show();

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
                if (x > 1 && y > 1) {
                    imageView.setScaleX((float) x - 1);
                    imageView.setScaleY((float) y - 1);
                }
                else{
                    Toast.makeText(MainActivity.this,"You can not zoom out less than",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
