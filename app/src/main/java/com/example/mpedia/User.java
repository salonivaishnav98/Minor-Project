package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class User extends AppCompatActivity implements View.OnClickListener {

    TextView user_username,user_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        getSupportActionBar().setTitle("User");

        user_username = findViewById(R.id.user_username);
        user_username.setOnClickListener(this);

        user_contact = findViewById(R.id.user_contact);
        user_contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}