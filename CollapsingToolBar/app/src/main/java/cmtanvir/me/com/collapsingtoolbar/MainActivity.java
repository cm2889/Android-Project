package cmtanvir.me.com.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bankcard,ideascard,wificard,linkcard,addcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defning cards
        bankcard =(CardView) findViewById(R.id.bankcardId);
        ideascard=(CardView) findViewById(R.id.ideas_card);
        wificard=(CardView) findViewById(R.id.wifi_card);
        linkcard=(CardView) findViewById(R.id.link_card);
        addcard=(CardView) findViewById(R.id.add_card);
        // Add onclick listner to the cards
        bankcard.setOnClickListener(this);
        ideascard.setOnClickListener(this);
        wificard.setOnClickListener(this);
        linkcard.setOnClickListener(this);
        addcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.bankcardId:intent = new Intent(this,Bank.class); startActivity(intent);break;
            case R.id.ideas_card:intent = new Intent(this,Ideas.class);startActivity(intent);break;
            case R.id.wifi_card:intent = new Intent(this,Wifi.class);startActivity(intent);break;
            case R.id.link_card:intent = new Intent(this,Link.class);startActivity(intent);break;
            case R.id.add_card:intent = new Intent(this,Add.class);startActivity(intent);break;
            default:break;
        }


    }
}
