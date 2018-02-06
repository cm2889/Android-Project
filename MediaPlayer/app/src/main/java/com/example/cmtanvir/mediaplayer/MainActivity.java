package com.example.cmtanvir.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton playButton,pasuseButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton =(ImageButton) findViewById(R.id.playButtonId);
        pasuseButton =(ImageButton) findViewById(R.id.pauseButtonId);

        mediaPlayer = MediaPlayer.create(this,R.raw.just);
        playButton.setOnClickListener(this);
        pasuseButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.playButtonId){
            if(mediaPlayer!=null){
                mediaPlayer.start();
                int duration=  mediaPlayer.getDuration()/1000;
                Toast.makeText(MainActivity.this,"Songs are played "+ duration,Toast.LENGTH_SHORT).show();

            }

        }
        if(view.getId()==R.id.pauseButtonId){
            if(mediaPlayer!=null){
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this,"Songs are paused",Toast.LENGTH_SHORT).show();

            }

        }


    }

    @Override
    protected void onDestroy() {

        if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer=null;
        }
        super.onDestroy();
    }
}
