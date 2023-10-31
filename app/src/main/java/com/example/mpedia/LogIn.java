package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText username,password;
    TextView forgetP, create_acc;
    Button loginB;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        getSupportActionBar().setTitle("Login Your Account");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        forgetP = (TextView) findViewById(R.id.forgetP);
        create_acc = (TextView) findViewById(R.id.create_acc);
        loginB = (Button) findViewById(R.id.loginB);
        DB = new DBHelper(this);

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LogIn.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                    if(checkuserpass == true){
                        Toast.makeText(LogIn.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), BookTicket.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LogIn.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        create_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Create_Account.class);
                startActivity(intent);
            }
        });
        forgetP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Forget_Password.class);
                startActivity(intent);
            }
        });
    }
}