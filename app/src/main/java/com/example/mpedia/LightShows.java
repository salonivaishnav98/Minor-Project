package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LightShows extends AppCompatActivity implements View.OnClickListener {

    ImageButton mandu_btn, orchafort_btn, gwalior_night, khajuraho_night ,sachi_night;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_32_0_lightshows);
        mandu_btn = (ImageButton) findViewById(R.id.mandu_btn);
        mandu_btn.setOnClickListener(this);

        orchafort_btn = (ImageButton) findViewById(R.id.orchafort_btn);
        orchafort_btn.setOnClickListener(this);

        gwalior_night = (ImageButton) findViewById(R.id.gwalior_night);
        gwalior_night.setOnClickListener(this);

        khajuraho_night = (ImageButton) findViewById(R.id.khajuraho_night);
        khajuraho_night.setOnClickListener(this);

        sachi_night = (ImageButton) findViewById(R.id.sachi_night);
        sachi_night.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.mandu_btn){Mandu();}
        if(v.getId() == R.id.orchafort_btn){OrchaFort();}
        if(v.getId() == R.id.gwalior_night){GwaliorFort();}
        if(v.getId() == R.id.khajuraho_night){KhajurahoFort();}
        if(v.getId() == R.id.sachi_night){Sachi();}

    }
    public void Mandu(){
        Intent intent1 = new Intent(this, Mandu.class);
        startActivity(intent1);
    }
    public void OrchaFort(){
        Intent intent2 = new Intent(this, OrchaFort.class);
        startActivity(intent2);
    }

    public void GwaliorFort(){
        Intent intent3 = new Intent(this, GwaliorFort.class);
        startActivity(intent3);
    }

    public void KhajurahoFort(){
        Intent intent4 = new Intent(this, KhajurahoFort.class);
        startActivity(intent4);
    }

    public void Sachi(){
        Intent intent5 = new Intent(this, Sachi.class);
        startActivity(intent5);
    }
}