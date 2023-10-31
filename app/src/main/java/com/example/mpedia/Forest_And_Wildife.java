package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Forest_And_Wildife extends AppCompatActivity implements View.OnClickListener {

    ImageButton np_panna,np_pench,np_satpura,np_kuno,np_kanha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forest_and_wildife);
        getSupportActionBar().setTitle("Forest and Wildlife");

        np_panna = (ImageButton) findViewById(R.id.np_panna);
        np_panna.setOnClickListener(this);

        np_pench = (ImageButton) findViewById(R.id.np_pench);
        np_pench.setOnClickListener(this);

        np_satpura = (ImageButton) findViewById(R.id.np_satpura);
        np_satpura.setOnClickListener(this);

        np_kuno = (ImageButton) findViewById(R.id.np_kuno);
        np_kuno.setOnClickListener(this);

        np_kanha = (ImageButton) findViewById(R.id.np_kanha);
        np_kanha.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.np_panna){NP_Panna();}
        if(v.getId() == R.id.np_pench){NP_Pench();}
        if(v.getId() == R.id.np_satpura){NP_Satpura();}
        if(v.getId() == R.id.np_kuno){NP_Kuno();}
        if(v.getId() == R.id.np_kanha){NP_Kanha();}
    }
    public void NP_Panna(){

        Intent intent1 = new Intent(this, NP_Panna.class);
        startActivity(intent1);

    }

    public void NP_Pench(){

        Intent intent1 = new Intent(this, NP_Pench.class);
        startActivity(intent1);

    }
    public void NP_Satpura(){

        Intent intent1 = new Intent(this, NP_Satpura.class);
        startActivity(intent1);

    }
    public void NP_Kuno(){

        Intent intent1 = new Intent(this, NP_Kuno.class);
        startActivity(intent1);

    }

    public void NP_Kanha(){

        Intent intent1 = new Intent(this, NP_Kanha.class);
        startActivity(intent1);

    }
}