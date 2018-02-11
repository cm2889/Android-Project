package cmtanvir.me.com.usersettingstore;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout= (LinearLayout) findViewById(R.id.linearId);
        if(loadColor()!=getResources().getColor(R.color.colorAccent))
        {
            linearLayout.setBackgroundColor(loadColor());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.redcolorId)
        {
          linearLayout.setBackgroundColor(getResources().getColor(R.color.redcolor));
          storeColor(getResources().getColor(R.color.redcolor));
        }
        if(item.getItemId()==R.id.greencolorId)
        {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.greencolor));
            storeColor(getResources().getColor(R.color.greencolor));
        }
        if(item.getItemId()==R.id.yellowcolorId)
        {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.yellowcolor));
            storeColor(getResources().getColor(R.color.yellowcolor));
        }

        return super.onOptionsItemSelected(item);
    }
    private void storeColor(int color)
    {
        SharedPreferences sharedPreferences= getSharedPreferences("backgroundColor", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt("myColor",color);
        editor.commit();
    }
    private int loadColor()
    {
        SharedPreferences sharedPreferences= getSharedPreferences("backgroundColor", Context.MODE_PRIVATE);
        int selectedColor= sharedPreferences.getInt("myColor",getResources().getColor(R.color.colorAccent));
        return selectedColor;
    }
}
