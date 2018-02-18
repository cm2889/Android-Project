package cmtanvir.me.com.userinformationdatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText E1,E2,E3,E4;
    private TextView T1;
    private Button button;
    sqlite my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=(EditText) findViewById(R.id.text1Id);
        E2=(EditText) findViewById(R.id.text2Id);
        E3=(EditText) findViewById(R.id.text3Id);
        E4=(EditText) findViewById(R.id.text4Id);
        button=(Button) findViewById(R.id.buttonId);
        T1= (TextView)  findViewById(R.id.textId);
        my= new sqlite(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 boolean  checkers =my.adToTable(E1.getText().toString(),E2.getText().toString(),E3.getText().toString(),E4.getText().toString());
                 if(checkers==true){
                     Toast.makeText(MainActivity.this,"Succesfull inserted",Toast.LENGTH_LONG).show();
                 }
                 else {
                     Toast.makeText(MainActivity.this,"Succesfull not  inserted",Toast.LENGTH_LONG).show();
                 }

            }
        });
    }
    //View Data starts here
    public void viewData( View view){
        Cursor result= my.display();
        if(result.getCount()==0)
        {
            Toast.makeText(MainActivity.this,"No Data Found",Toast.LENGTH_LONG).show();
            return;
        }
        result.moveToFirst();
        StringBuffer buffer = new StringBuffer();

        do{

            buffer.append("ID:"+result.getString(0)+"\n");
            buffer.append("First Name:"+result.getString(1)+"\n");
            buffer.append("Last Name:"+result.getString(2)+"\n");
            buffer.append("Email:"+result.getString(3)+"\n\n");
        }while (result.moveToNext());
        Display(buffer.toString());

    }
    public void Display(String data){
        T1.setText(data);

    }
    // view Data ends here
   public void UpdateData(View view){
        boolean checkers= my.updateData(E1.getText().toString(),E2.getText().toString(),E3.getText().toString(),E4.getText().toString());
       if(checkers==true){
           Toast.makeText(MainActivity.this,"Succesfull Updated",Toast.LENGTH_LONG).show();
       }
       else {
           Toast.makeText(MainActivity.this,"Succesfull not  updated",Toast.LENGTH_LONG).show();
       }


   }
   // Update Ends Here
   // Delete Starts Here
    public void delete (View view){
       int deltechecker = my.deletedata(E1.getText().toString());
        if(deltechecker>0){
            Toast.makeText(MainActivity.this,"Succesfull Delted",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Succesfull not  updated",Toast.LENGTH_LONG).show();
        }

    }


    // Delete Ends here
}
