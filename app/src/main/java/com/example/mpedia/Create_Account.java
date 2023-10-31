package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Create_Account extends AppCompatActivity {

    EditText new_username,new_password,new_confirm_password,phone_no;
    TextView sign_in;
    Button new_account;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        getSupportActionBar().setTitle("Create Account");

        new_username = (EditText) findViewById(R.id.new_username);
        new_password = (EditText) findViewById(R.id.new_password);
        new_confirm_password = (EditText) findViewById(R.id.new_confirm_password);
        sign_in = (TextView) findViewById(R.id.sign_in);
        new_account = (Button) findViewById(R.id.new_account);
        phone_no = (EditText) findViewById(R.id.phone_no);

        DB = new DBHelper(this);

        new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = new_username.getText().toString();
                String pass = new_password.getText().toString();
                String repass = new_confirm_password.getText().toString();
                String no = phone_no.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals("")||phone_no.equals(""))
                    Toast.makeText(Create_Account.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.chackusername(user);
                        if(checkuser == false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert == true){
                                Toast.makeText(Create_Account.this, "Account created successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),BookTicket.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(Create_Account.this, "Something went wrong!\nTry again Later", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Create_Account.this, "User alreay exists! please Sign-in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Create_Account.this, "Password not matching", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),LogIn.class);
                startActivity(intent);
            }
        });

    }
}