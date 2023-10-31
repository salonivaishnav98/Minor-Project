package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SearchCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_city);
        getSupportActionBar().setTitle("Search Cities");


    }
}