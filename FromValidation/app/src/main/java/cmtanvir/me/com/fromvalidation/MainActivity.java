package cmtanvir.me.com.fromvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username,password,email,phoneNumber,cgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.usernameId);
        password = (EditText) findViewById(R.id.passwordId);
        email = (EditText) findViewById(R.id.emailId);
        phoneNumber=(EditText) findViewById(R.id.mobileNumberId);
        cgpa=(EditText) findViewById(R.id.cgpaId);
    }

    public void saveData(View view) {
        boolean error = false;
        String user= username.getText().toString();
        if(user.isEmpty()){
            username.setError("User Name is missing");
            error= true;
        }
        else if (user.length()<5){
            username.setError("user Name is too Short");
            error = true;
        }

        String pass = password.getText().toString();
        if(pass.isEmpty()){
            password.setError("Password is not Empty");
            error = true;
        }
        else if(pass.length()<5){
            password.setError("Password is too Short");
            error = true;
        }
        String cgpaa = cgpa.getText().toString();

        if(cgpaa.isEmpty()){
            cgpa.setError("Your CGpa Is Missing");
            error = true;
        }
        else {
            Float gpas= Float.parseFloat(cgpaa);
            if(gpas>4.00){
                cgpa.setError("CGpa Is not more than 4.00!!!");
                error = true;
            }
        }
        String mail= email.getText().toString();
        if(mail.isEmpty()){
            email.setError("Email is Missing");
            error = true;
        }
        String phone= phoneNumber.getText().toString();
        if(phone.isEmpty()){
            phoneNumber.setError("Phone number is Missing ");
            error = true;
        }
        else if(phone.length()<11){
            phoneNumber.setError("Mobile number is too sort");
            error = true;
        }
        else if(phone.length()>11){
            phoneNumber.setError("phone number is too long!!1");
            error = true;
        }
        if (error==true){
            Toast.makeText(MainActivity.this,"Data Sould Be correct!!",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"ok Succesfully save",Toast.LENGTH_LONG).show();
        }

    }
}
