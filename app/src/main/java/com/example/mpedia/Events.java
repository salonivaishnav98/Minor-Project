package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Events extends AppCompatActivity implements View.OnClickListener {

    ImageButton event1,event2,event3,event4,event5,event6,event7,event8,event9,event10,event11,event12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_40_events);
        getSupportActionBar().setTitle("Events");

        event1 = findViewById(R.id.event1);
        event1.setOnClickListener(this);

        event2 = findViewById(R.id.event2);
        event2.setOnClickListener(this);

        event3 = findViewById(R.id.event3);
        event3.setOnClickListener(this);

        event4 = findViewById(R.id.event4);
        event4.setOnClickListener(this);

        event5 = findViewById(R.id.event5);
        event5.setOnClickListener(this);

        event6 = findViewById(R.id.event6);
        event6.setOnClickListener(this);

        event7 = findViewById(R.id.event7);
        event7.setOnClickListener(this);

        event8 = findViewById(R.id.event8);
        event8.setOnClickListener(this);

        event9 = findViewById(R.id.event9);
        event9.setOnClickListener(this);

        event10 = findViewById(R.id.event10);
        event10.setOnClickListener(this);

        event11 = findViewById(R.id.event11);
        event11.setOnClickListener(this);

        event12 = findViewById(R.id.event12);
        event12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.event1){event1();}
        if(v.getId() == R.id.event2){event2();}
        if(v.getId() == R.id.event3){event3();}
        if(v.getId() == R.id.event4){event4();}
        if(v.getId() == R.id.event5){event5();}
        if(v.getId() == R.id.event6){event6();}
        if(v.getId() == R.id.event7){event7();}
        if(v.getId() == R.id.event8){event8();}
        if(v.getId() == R.id.event9){event9();}
        if(v.getId() == R.id.event10){event10();}
        if(v.getId() == R.id.event11){event11();}
        if(v.getId() == R.id.event12){event12();}

    }
    public void event1(){

        Intent intent1 = new Intent(this, Event1.class);
        startActivity(intent1);
    }
    public void event2(){

        Intent intent1 = new Intent(this, Event2.class);
        startActivity(intent1);

    }
    public void event3(){

        Intent intent1 = new Intent(this, Event3.class);
        startActivity(intent1);

    }
    public void event4(){

        Intent intent1 = new Intent(this, Event4.class);
        startActivity(intent1);

    }
    public void event5(){

        Intent intent1 = new Intent(this, Event5.class);
        startActivity(intent1);

    }
    public void event6(){

        Intent intent1 = new Intent(this, Event6.class);
        startActivity(intent1);

    }
    public void event7(){

        Intent intent1 = new Intent(this, Event7.class);
        startActivity(intent1);

    }
    public void event8(){

        Intent intent1 = new Intent(this, Event8.class);
        startActivity(intent1);

    }
    public void event9(){

        Intent intent1 = new Intent(this, Event9.class);
        startActivity(intent1);

    }
    public void event10(){

        Intent intent1 = new Intent(this, Event10.class);
        startActivity(intent1);

    }
    public void event11(){

        Intent intent1 = new Intent(this, Event11.class);
        startActivity(intent1);

    }
    public void event12() {

        Intent intent1 = new Intent(this, Event12.class);
        startActivity(intent1);
    }
}