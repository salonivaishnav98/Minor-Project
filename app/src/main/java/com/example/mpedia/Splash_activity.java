package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent isplash = new Intent(Splash_activity.this, MainActivity.class);
                startActivity(isplash);
                finish();//pop activity from stack
            }
        },2000);


    }
}