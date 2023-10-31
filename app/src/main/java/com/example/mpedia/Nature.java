package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Nature extends AppCompatActivity implements View.OnClickListener {

    ImageButton nature0,nature1,nature2,nature3,nature4,nature5,nature6;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nature);
        getSupportActionBar().setTitle("Nature");

        nature0 = findViewById(R.id.nature0);
        nature0.setOnClickListener(this);

        nature1 = findViewById(R.id.nature1);
        nature1.setOnClickListener(this);

        nature2 = findViewById(R.id.nature2);
        nature2.setOnClickListener(this);

        nature3 = findViewById(R.id.nature3);
        nature3.setOnClickListener(this);

        nature4 = findViewById(R.id.nature4);
        nature4.setOnClickListener(this);

        nature5 = findViewById(R.id.nature5);
        nature5.setOnClickListener(this);

        nature6 = findViewById(R.id.nature6);
        nature6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.nature0){Nature_Bhedghat();}
        if(v.getId() == R.id.nature1){Nature_Panchmarhi();}
        if(v.getId() == R.id.nature2){Nature_patalpani();}
        if(v.getId() == R.id.nature3){Nature_ChoralDam();}
        if(v.getId() == R.id.nature4){Nature_Gulawat();}
        if(v.getId() == R.id.nature5){Nature_Janapav();}
        if(v.getId() == R.id.nature6){Nature_Ralamandal();}
    }

    public void Nature_Bhedghat(){

        Intent intent1 = new Intent(this, Nature_Bhedghat.class);
        startActivity(intent1);

    }
    public void Nature_patalpani(){

        Intent intent1 = new Intent(this, Nature_patalpani.class);
        startActivity(intent1);

    }
    public void Nature_Panchmarhi(){

        Intent intent1 = new Intent(this, Nature_Panchmarhi.class);
        startActivity(intent1);

    }
    public void Nature_ChoralDam(){

        Intent intent1 = new Intent(this, Nature_ChoralDam.class);
        startActivity(intent1);

    }
    public void Nature_Gulawat(){

        Intent intent1 = new Intent(this, Nature_Gulawat.class);
        startActivity(intent1);

    }
    public void Nature_Janapav(){

        Intent intent1 = new Intent(this, Nature_Janapav.class);
        startActivity(intent1);

    }
    public void Nature_Ralamandal(){

        Intent intent1 = new Intent(this, Nature_Ralamandal.class);
        startActivity(intent1);

    }
}