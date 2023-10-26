package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton experienceMP, events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02_main);
        experienceMP = (ImageButton) findViewById(R.id.experienceMP);
        experienceMP.setOnClickListener(this);

        events = (ImageButton) findViewById(R.id.events);
        events.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
         if(v.getId() == R.id.experienceMP){ExperienceMP();}
        if(v.getId() == R.id.events){Events();}

    }
    public void ExperienceMP(){
        Intent intent1 = new Intent(this, ExperienceMP.class);
        startActivity(intent1);
    }
    public void Events(){
        Intent intent2 = new Intent(this, Events.class);
        startActivity(intent2);
    }
}