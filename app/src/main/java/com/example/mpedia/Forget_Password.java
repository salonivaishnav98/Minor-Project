package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forget_Password extends AppCompatActivity {

    EditText seearch_username;
    Button search;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);
        getSupportActionBar().setTitle("Forget Password");

        seearch_username = (EditText) findViewById(R.id.search_username);
        search = (Button) findViewById(R.id.search);

        DB = new DBHelper(this);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchname = seearch_username.getText().toString();

                Boolean checkuser = DB.chackusername(searchname);
                    if(checkuser == true) {
                        Intent intent = new Intent(getApplicationContext(), Reset_password.class);
                        intent.putExtra("username",searchname);
                        startActivity(intent);
                    } if (searchname.equals("")) {
                        Toast.makeText(Forget_Password.this, "First enter your username!", Toast.LENGTH_SHORT).show();
                    } else{
                        Toast.makeText(Forget_Password.this, "User not found!", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }

}