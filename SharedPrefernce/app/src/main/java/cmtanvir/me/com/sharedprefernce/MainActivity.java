package cmtanvir.me.com.sharedprefernce;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView detailstextView;
    private Button savebutton,loadbutton;
    private EditText usernmae,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detailstextView =(TextView) findViewById(R.id.detailsTextId);
        savebutton = (Button) findViewById(R.id.saveButtonId);
        loadbutton = (Button) findViewById(R.id.loadButtonId);
        usernmae= (EditText) findViewById(R.id.usernameId);
        password =(EditText) findViewById(R.id.passwordId);
        savebutton.setOnClickListener(this);
        loadbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.saveButtonId)
        {
           String user=usernmae.getText().toString();
           String pass = password.getText().toString();
           if(user.equals("")&& pass.equals(""))
           {
               Toast.makeText(getApplicationContext(),"Please Enter Some Date",Toast.LENGTH_SHORT).show();
           }
           else
           {
               // Store Data or Write Data
               SharedPreferences sharedPreferences= getSharedPreferences("userDetails", Context.MODE_PRIVATE);
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putString("userNameKey",user);
               editor.putString("passwordKey",pass);
               editor.commit();
               usernmae.setText("");
               password.setText("");
               Toast.makeText(getApplicationContext(),"Data Store Successfully",Toast.LENGTH_SHORT).show();
           }

        }
        else if(view.getId()==R.id.loadButtonId)
        {
            //To read data
            SharedPreferences sharedPreferences= getSharedPreferences("userDetails", Context.MODE_PRIVATE);
            if(sharedPreferences.contains("userNameKey")&&sharedPreferences.contains("passwordKey"))
            {
                String user= sharedPreferences.getString("userNameKey","Data Not found");
                String pass = sharedPreferences.getString("passwordKey","Data Not founed");
                detailstextView.setText(user+"\n"+pass);
            }

        }

    }
}
