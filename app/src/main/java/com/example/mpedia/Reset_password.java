package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reset_password extends AppCompatActivity {

    EditText password_reset,reset_username,reset_confirm_password;
    Button reset;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
        getSupportActionBar().setTitle("Reset Password");

        password_reset =(EditText) findViewById(R.id.password_reset);
        reset_confirm_password =(EditText) findViewById(R.id.reset_confirm_password);
        reset = (Button) findViewById(R.id.reset);
        reset_username = (EditText) findViewById(R.id.reset_username);

        DB = new DBHelper(this);

        Intent intent = getIntent();
        reset_username.setText(intent.getStringExtra("username"));

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = reset_username.getText().toString();
                String password = password_reset.getText().toString();
                String repassword = password_reset.getText().toString();

                if(password.equals(repassword)){

                    Boolean checkpasswordupdate = DB.updatepassword(user,password);
                    if(checkpasswordupdate == true){
                        Intent intent = new Intent(getApplicationContext(), LogIn.class);
                        startActivity(intent);
                        Toast.makeText(Reset_password.this, "Reset Password successfully", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Reset_password.this, "Password not reset successfully!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Reset_password.this, "Password should be same", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}