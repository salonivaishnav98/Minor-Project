package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FortsAndPlaces extends AppCompatActivity implements View.OnClickListener {

    ImageButton gwalior_fort,maheshwar_fort,orcha_fort,Mandav_fort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forts_and_places);
        getSupportActionBar().setTitle("Forts and Places");

        gwalior_fort = (ImageButton) findViewById(R.id.gwalior_fort);
        gwalior_fort.setOnClickListener(this);

        maheshwar_fort = (ImageButton) findViewById(R.id.maheshwar_fort);
        maheshwar_fort.setOnClickListener(this);

        orcha_fort = (ImageButton) findViewById(R.id.orcha_fort);
        orcha_fort.setOnClickListener(this);

        Mandav_fort = (ImageButton) findViewById(R.id.Mandav_fort);
        Mandav_fort.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.gwalior_fort){Fort_Gwalior();}
        if(v.getId() == R.id.maheshwar_fort){Fort_Maheshwar();}
        if(v.getId() == R.id.orcha_fort){Fort_Orcha();}
        if(v.getId() == R.id.Mandav_fort){Fort_Mandav();}
    }
    public void Fort_Gwalior(){

        Intent intent1 = new Intent(this, Fort_Gwalior.class);
        startActivity(intent1);

    }

    public void Fort_Maheshwar(){

        Intent intent1 = new Intent(this, Fort_Maheshwar.class);
        startActivity(intent1);

    }
    public void Fort_Orcha(){

        Intent intent1 = new Intent(this, Fort_Orcha.class);
        startActivity(intent1);

    }
    public void Fort_Mandav(){

        Intent intent1 = new Intent(this, Fort_Mandav.class);
        startActivity(intent1);

    }
}