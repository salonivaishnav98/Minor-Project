package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tourist_Attraction extends AppCompatActivity implements View.OnClickListener {

    ImageButton forts,forest, nature,spirituals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_50_tourist_attraction);
        getSupportActionBar().setTitle("Tourist Attractions");

        forts = findViewById(R.id.forts);
        forts.setOnClickListener(this);

        forest = findViewById(R.id.forest);
        forest.setOnClickListener(this);

        nature = findViewById(R.id.nature);
        nature.setOnClickListener(this);

        spirituals = findViewById(R.id.spirituals);
        spirituals.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.forts){FortsAndPlaces();}
        if(v.getId() == R.id.forest){Forest_And_Wildife();}
        if(v.getId() == R.id.nature){Nature();}
        if(v.getId() == R.id.spirituals){Spirituals();}
    }
    public void FortsAndPlaces(){
        Intent intent2 = new Intent(this, FortsAndPlaces.class);
        startActivity(intent2);
    }

    public void Forest_And_Wildife(){
        Intent intent2 = new Intent(this, Forest_And_Wildife.class);
        startActivity(intent2);
    }

    public void Nature(){
        Intent intent2 = new Intent(this, Nature.class);
        startActivity(intent2);
    }

    public void Spirituals(){
        Intent intent2 = new Intent(this, Spirituals.class);
        startActivity(intent2);
    }
}