package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ExperienceMP extends AppCompatActivity implements View.OnClickListener {
    ImageButton night_tourism,sound_light_btn,musicdances,textiles,shopping,adventure,foods;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30_experience_mp);
        getSupportActionBar().setTitle("Experience MP");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        night_tourism = (ImageButton) findViewById(R.id.night_tourism);
        night_tourism.setOnClickListener(this);

        sound_light_btn = (ImageButton) findViewById(R.id.sound_light_btn);
        sound_light_btn.setOnClickListener(this);

        musicdances = (ImageButton) findViewById(R.id.musicdances);
        musicdances.setOnClickListener(this);

        textiles = (ImageButton) findViewById(R.id.textiles);
        textiles.setOnClickListener(this);

        shopping = (ImageButton) findViewById(R.id.shopping);
        shopping.setOnClickListener(this);

        adventure = (ImageButton) findViewById(R.id.adventure);
        adventure.setOnClickListener(this);

        foods = (ImageButton) findViewById(R.id.foods);
        foods.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.night_tourism){NightTourism();}
        if(v.getId() == R.id.sound_light_btn){LightShows();}
        if(v.getId() == R.id.musicdances){MusicDance();}
        if(v.getId() == R.id.textiles){Textiles();}
        if(v.getId() == R.id.shopping){Shopping();}
        if(v.getId() == R.id.adventure){Adventure();}
        if(v.getId() == R.id.foods){Food();}

    }
    public void NightTourism(){

        Intent intent1 = new Intent(this, NightTourism.class);
        startActivity(intent1);

    }
    public void LightShows(){
        Intent intent2 = new Intent(this, LightShows.class);
        startActivity(intent2);
    }

    public void MusicDance(){
        Intent intent3 = new Intent(this, MusicDance.class);
        startActivity(intent3);
    }

    public void Textiles(){
        Intent intent4 = new Intent(this, Textiles.class);
        startActivity(intent4);
    }

    public void Shopping(){
        Intent intent5 = new Intent(this, Shopping.class);
        startActivity(intent5);
    }

    public void Adventure(){
        Intent intent6 = new Intent(this, Adventure.class);
        startActivity(intent6);
    }

    public void Food(){
        Intent intent7 = new Intent(this, Food.class);
        startActivity(intent7);
    }
}