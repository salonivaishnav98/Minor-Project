package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchCity extends AppCompatActivity {
    SearchView inner_search_view;

    ListView listview;

    ArrayList cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_city);
        getSupportActionBar().setTitle("Search Cities");

        listview = findViewById(R.id.listview);
        inner_search_view = findViewById(R.id.inner_search_view);

        cities = new ArrayList();
        cities.add("Indore");
        cities.add("Bhopal");
        cities.add("Gwalior");
        cities.add("Ujjain");
        cities.add("Khajuraho");
        cities.add("Maheshwar");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,cities);
        listview.setAdapter(adapter);

        inner_search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });



    }
}