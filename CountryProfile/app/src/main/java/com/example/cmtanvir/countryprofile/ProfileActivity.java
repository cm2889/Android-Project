package com.example.cmtanvir.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.imageId);
        textView = (TextView) findViewById(R.id.textId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){

            String countryName = bundle.getString("name");

            showdetails(countryName);
        }
    }

    void showdetails(String countryName){

        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.b);
            textView.setText(R.string.bangladesh_text);
        }
        if(countryName.equals("india")){
            imageView.setImageResource(R.drawable.in);
            textView.setText(R.string.india_text);
        }
        if(countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakis);
            textView.setText(R.string.pakistan_text);
        }
    }
}
