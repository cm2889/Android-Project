package cmtanvir.me.com.picaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView) findViewById(R.id.imageId);
        image2=(ImageView) findViewById(R.id.image2Id);
        Picasso.with(getApplicationContext())
                .load("" +
                        "").into(imageView);
        Picasso.with(getApplicationContext())
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi7VU1UA54vB0LLXECJS6TT84gQDMXC3bEEdQjmZAesXKSLtqZ").into(image2);


    }
}
