package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NightTourism extends AppCompatActivity implements View.OnClickListener{

    ImageButton sarafa_btn,safari1,safari2,safari3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_31_0_night_tourism);
        sarafa_btn = findViewById(R.id.sarafa_btn);
        sarafa_btn.setOnClickListener(this);

        safari1 = findViewById(R.id.safari1);
        safari1.setOnClickListener(this);

        safari2 = findViewById(R.id.safari2);
        safari2.setOnClickListener(this);

        safari3 = findViewById(R.id.safari3);
        safari3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.sarafa_btn){Sarafa();}
        if(v.getId() == R.id.safari1){PenchNP();}
        if(v.getId() == R.id.safari2){KanhaNP();}
        if(v.getId() == R.id.safari3){BandhavgarhNP();}

    }
    public void Sarafa(){

        Intent intent1 = new Intent(this, Sarafa.class);
        startActivity(intent1);

    }

    public void PenchNP(){

        Intent intent2 = new Intent(this, PenchNP.class);
        startActivity(intent2);

    }

    public void KanhaNP(){

        Intent intent3 = new Intent(this, KanhaNP.class);
        startActivity(intent3);

    }

    public void BandhavgarhNP(){

        Intent intent4 = new Intent(this, BandhavgarhNP.class);
        startActivity(intent4);

    }
}