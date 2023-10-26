package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Adventure extends AppCompatActivity implements View.OnClickListener {
     ImageButton adventure1,adventure2,adventure3,adventure4,adventure5,adventure6,adventure7,adventure8,adventure9,adventure10,adventure11,adventure12,adventure13,adventure14,adventure15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_36_0_adventure);
        adventure1 = findViewById(R.id.adventure1);
        adventure1.setOnClickListener(this);

        adventure2 = findViewById(R.id.adventure2);
        adventure2.setOnClickListener(this);

        adventure3 = findViewById(R.id.adventure3);
        adventure3.setOnClickListener(this);

        adventure4 = findViewById(R.id.adventure4);
        adventure4.setOnClickListener(this);

        adventure5 = findViewById(R.id.adventure5);
        adventure5.setOnClickListener(this);

        adventure6 = findViewById(R.id.adventure6);
        adventure6.setOnClickListener(this);

        adventure7 = findViewById(R.id.adventure7);
        adventure7.setOnClickListener(this);

        adventure8 = findViewById(R.id.adventure8);
        adventure8.setOnClickListener(this);

        adventure9 = findViewById(R.id.adventure9);
        adventure9.setOnClickListener(this);

        adventure10 = findViewById(R.id.adventure10);
        adventure10.setOnClickListener(this);

        adventure11 = findViewById(R.id.adventure11);
        adventure11.setOnClickListener(this);

        adventure12 = findViewById(R.id.adventure12);
        adventure12.setOnClickListener(this);

        adventure13 = findViewById(R.id.adventure13);
        adventure13.setOnClickListener(this);

        adventure14 = findViewById(R.id.adventure14);
        adventure14.setOnClickListener(this);

        adventure15 = findViewById(R.id.adventure15);
        adventure15.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.adventure1){Adventure1();}
        if(v.getId() == R.id.adventure2){Adventure2();}
        if(v.getId() == R.id.adventure3){Adventure3();}
        if(v.getId() == R.id.adventure4){Adventure4();}
        if(v.getId() == R.id.adventure5){Adventure5();}
        if(v.getId() == R.id.adventure6){Adventure6();}
        if(v.getId() == R.id.adventure7){Adventure7();}
        if(v.getId() == R.id.adventure8){Adventure8();}
        if(v.getId() == R.id.adventure9){Adventure9();}
        if(v.getId() == R.id.adventure10){Adventure10();}
        if(v.getId() == R.id.adventure11){Adventure11();}
        if(v.getId() == R.id.adventure12){Adventure12();}
        if(v.getId() == R.id.adventure13){Adventure13();}
        if(v.getId() == R.id.adventure14){Adventure14();}
        if(v.getId() == R.id.adventure15){Adventure15();}


    }
    public void Adventure1(){

        Intent intent1 = new Intent(this, Adventure1.class);
        startActivity(intent1);

    }
    public void Adventure2(){

        Intent intent1 = new Intent(this, Adventure2.class);
        startActivity(intent1);

    }
    public void Adventure3(){

        Intent intent1 = new Intent(this, Adventure3.class);
        startActivity(intent1);

    }
    public void Adventure4(){

        Intent intent1 = new Intent(this, Adventure4.class);
        startActivity(intent1);

    }
    public void Adventure5(){

        Intent intent1 = new Intent(this, Adventure5.class);
        startActivity(intent1);

    }
    public void Adventure6(){

        Intent intent1 = new Intent(this, Adventure6.class);
        startActivity(intent1);

    }
    public void Adventure7(){

        Intent intent1 = new Intent(this, Adventure7.class);
        startActivity(intent1);

    }
    public void Adventure8(){

        Intent intent1 = new Intent(this, Adventure8.class);
        startActivity(intent1);

    }
    public void Adventure9(){

        Intent intent1 = new Intent(this, Adventure9.class);
        startActivity(intent1);

    }
    public void Adventure10(){

        Intent intent1 = new Intent(this, Adventure10.class);
        startActivity(intent1);

    }
    public void Adventure11(){

        Intent intent1 = new Intent(this, Adventure11.class);
        startActivity(intent1);

    }
    public void Adventure12(){

        Intent intent1 = new Intent(this, Adventure12.class);
        startActivity(intent1);

    }
    public void Adventure13(){

        Intent intent1 = new Intent(this, Adventure13.class);
        startActivity(intent1);

    }
    public void Adventure14(){

        Intent intent1 = new Intent(this, Adventure14.class);
        startActivity(intent1);

    }
    public void Adventure15(){

        Intent intent1 = new Intent(this, Adventure15.class);
        startActivity(intent1);

    }

}