package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Spirituals extends AppCompatActivity implements View.OnClickListener {

    ImageButton spiritual1,spiritual2,spiritual3,spiritual4,spiritual5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spirituals);
        getSupportActionBar().setTitle("Spirituals of MP");

        spiritual1 = findViewById(R.id.spiritual1);
        spiritual1.setOnClickListener(this);

        spiritual2 = findViewById(R.id.spiritual2);
        spiritual2.setOnClickListener(this);

        spiritual3 = findViewById(R.id.spiritual3);
        spiritual3.setOnClickListener(this);

        spiritual4 = findViewById(R.id.spiritual4);
        spiritual4.setOnClickListener(this);

        spiritual5 = findViewById(R.id.spiritual5);
        spiritual5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.spiritual1){Spiritual_Khajuraho();}
        if(v.getId() == R.id.spiritual2){Spiritual_Khajarana();}
        if(v.getId() == R.id.spiritual3){Spiritual_Omkareshwar();}
        if(v.getId() == R.id.spiritual4){Spiritual_Maheshwar();}
        if(v.getId() == R.id.spiritual5){Spiritual_Mahakaleshwar();}
    }

    public void Spiritual_Khajuraho(){
        Intent intent2 = new Intent(this, Spiritual_Khajuraho.class);
        startActivity(intent2);
    }
    public void Spiritual_Khajarana(){
        Intent intent2 = new Intent(this, Spiritual_Khajarana.class);
        startActivity(intent2);
    }
    public void Spiritual_Omkareshwar(){
        Intent intent2 = new Intent(this, Spiritual_Omkareshwar.class);
        startActivity(intent2);
    }
    public void Spiritual_Maheshwar(){
        Intent intent2 = new Intent(this, Spiritual_Maheshwar.class);
        startActivity(intent2);
    }
    public void Spiritual_Mahakaleshwar(){
        Intent intent2 = new Intent(this, Spiritual_Mahakaleshwar.class);
        startActivity(intent2);
    }
}