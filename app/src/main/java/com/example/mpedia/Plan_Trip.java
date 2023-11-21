package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Plan_Trip extends AppCompatActivity{

    RadioButton city1,city2,city3,city4,city5;
    RadioGroup citi_radioGroup;
    Button plan_trip_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_trip);
        getSupportActionBar().setTitle("Plan Your Trip");

        plan_trip_btn = findViewById(R.id.plan_trip_btn);
        city1 = findViewById(R.id.city1);
        city2 = findViewById(R.id.city2);
        city3 = findViewById(R.id.city3);
        city4 = findViewById(R.id.city4);

        city5 = findViewById(R.id.city5);
        plan_trip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(city1.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), Plan_Indore.class);
                    startActivity(intent);

                }
                else if(city2.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),Plan_Bhopal.class);
                    startActivity(intent);
                }
                else if(city3.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),Plan_Gwalior.class);
                    startActivity(intent);
                }
                else if(city4.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),Plan_Ujjain.class);
                    startActivity(intent);
                }
                else if(city5.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),Plan_Khajuraho.class);
                    startActivity(intent);
                }
                else{Toast.makeText(Plan_Trip.this, "Select at least one", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    //second method

//    @Override
//    public void onClick(View v) {
//
//        if(v.getId() == R.id.city1){Indore_Plan();}
//        if(v.getId() == R.id.city4){Plan_Ujjain();}
//        if(v.getId() == R.id.city2){Plan_Bhopal();}
//        if(v.getId() == R.id.city3){Plan_Gwalior();}
//        if(v.getId() == R.id.city5){Plan_Khajuraho();}
//    }
//    public void Indore_Plan(){
//        Intent intent2 = new Intent(this, Plan_Indore.class);
//        startActivity(intent2);
//    }
//
//    public void Plan_Ujjain(){
//        Intent intent2 = new Intent(this, Plan_Ujjain.class);
//        startActivity(intent2);
//    }
//    public void Plan_Bhopal(){
//        Intent intent2 = new Intent(this, Plan_Bhopal.class);
//        startActivity(intent2);
//    }
//    public void Plan_Gwalior(){
//        Intent intent2 = new Intent(this, Plan_Gwalior.class);
//        startActivity(intent2);
//    }
//    public void Plan_Khajuraho(){
//        Intent intent2 = new Intent(this, Plan_Khajuraho.class);
//        startActivity(intent2);
//    }
}