package com.example.mpedia;

import static com.example.mpedia.R.color.purple;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    SearchView search_city;

    ImageButton experienceMP, events, touristattraction,photosbtn,tourist_attraction_forts,tourist_attraction_wildlife,tourist_attraction_nature,tourist_attraction_spirituals, explore_textiles,explore_lihghtshow,explore_food,explore_Dance,explore_adventure,fvrt_panchmarhi,fvrt_bhedghat,fvrt_mandav,fvrt_maheshwar,fvrt_khaajuraho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02_main);
        getSupportActionBar().setTitle("Tour MPedia");
        


        //other activities

        experienceMP = (ImageButton) findViewById(R.id.experienceMP);
        experienceMP.setOnClickListener(this);

        events = (ImageButton) findViewById(R.id.events);
        events.setOnClickListener(this);

        touristattraction = (ImageButton) findViewById(R.id.touristattraction);
        touristattraction.setOnClickListener(this);

        photosbtn = (ImageButton) findViewById(R.id.photosbtn);
        photosbtn.setOnClickListener(this);

        tourist_attraction_forts = (ImageButton) findViewById(R.id.tourist_attraction_forts);
        tourist_attraction_forts.setOnClickListener(this);

        tourist_attraction_wildlife = (ImageButton) findViewById(R.id.tourist_attraction_wildlife);
        tourist_attraction_wildlife.setOnClickListener(this);

        tourist_attraction_nature = (ImageButton) findViewById(R.id.tourist_attraction_nature);
        tourist_attraction_nature.setOnClickListener(this);

        tourist_attraction_spirituals = (ImageButton) findViewById(R.id.tourist_attraction_spirituals);
        tourist_attraction_spirituals.setOnClickListener(this);

        explore_textiles = (ImageButton) findViewById(R.id.explore_textiles);
        explore_textiles.setOnClickListener(this);

        explore_lihghtshow = (ImageButton) findViewById(R.id.explore_lihghtshow);
        explore_lihghtshow.setOnClickListener(this);

        explore_food = (ImageButton) findViewById(R.id.explore_food);
        explore_food.setOnClickListener(this);

        explore_Dance = (ImageButton) findViewById(R.id.explore_Dance);
        explore_Dance.setOnClickListener(this);

        explore_adventure = (ImageButton) findViewById(R.id.explore_adventure);
        explore_adventure.setOnClickListener(this);

        fvrt_panchmarhi = (ImageButton) findViewById(R.id.fvrt_panchmarhi);
        fvrt_panchmarhi.setOnClickListener(this);

        fvrt_bhedghat = (ImageButton) findViewById(R.id.fvrt_bhedghat);
        fvrt_bhedghat.setOnClickListener(this);

        fvrt_mandav = (ImageButton) findViewById(R.id.fvrt_mandav);
        fvrt_mandav.setOnClickListener(this);

        fvrt_maheshwar = (ImageButton) findViewById(R.id.fvrt_maheshwar);
        fvrt_maheshwar.setOnClickListener(this);

        fvrt_khaajuraho = (ImageButton) findViewById(R.id.fvrt_khaajuraho);
        fvrt_khaajuraho.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.home_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.plan_trip){
            Plan_Trip();
        }
        if(item.getItemId() == R.id.book_ticket){
            LogIn();
        }
        if(item.getItemId() == R.id.User){
            LogIn();
        }
        return super.onOptionsItemSelected(item);
    }
    public void Plan_Trip(){
        Intent intent1 = new Intent(this, Plan_Trip.class);
        startActivity(intent1);
    }
    public void LogIn(){
        Intent intent1 = new Intent(this, LogIn.class);
        startActivity(intent1);
    }


    @Override
    public void onClick(View v) {

        //if(v.getId() == R.id.searchview){SearchCity();}
        if(v.getId() == R.id.experienceMP){ExperienceMP();}
        if(v.getId() == R.id.events){Events();}
        if(v.getId() == R.id.touristattraction){Tourist_Attraction();}
        if(v.getId() == R.id.photosbtn){Photos();}
        if(v.getId() == R.id.tourist_attraction_forts){FortsAndPlaces();}
        if(v.getId() == R.id.tourist_attraction_wildlife){Forest_And_Wildife();}
        if(v.getId() == R.id.tourist_attraction_nature){Nature();}
        if(v.getId() == R.id.tourist_attraction_spirituals){Spirituals();}
        if(v.getId() == R.id.explore_textiles){Textiles();}
        if(v.getId() == R.id.explore_lihghtshow){LightShows();}
        if(v.getId() == R.id.explore_food){Food();}
        if(v.getId() == R.id.explore_Dance){MusicDance();}
        if(v.getId() == R.id.explore_adventure){Adventure();}
        if(v.getId() == R.id.fvrt_bhedghat){Nature_Bhedghat();}
        if(v.getId() == R.id.fvrt_panchmarhi){Nature_Panchmarhi();}
        if(v.getId() == R.id.fvrt_mandav){Fort_Mandav();}
        if(v.getId() == R.id.fvrt_maheshwar){Spiritual_Maheshwar();}
        if(v.getId() == R.id.fvrt_khaajuraho){Spiritual_Khajuraho();}



    }
//    public void SearchCity(){
//        Intent intent1 = new Intent(this, SearchCity.class);
//        startActivity(intent1);

   // }
    public void ExperienceMP(){
        Intent intent1 = new Intent(this, ExperienceMP.class);
        startActivity(intent1);
    }
    public void Events(){
        Intent intent2 = new Intent(this, Events.class);
        startActivity(intent2);
    }

    public void Tourist_Attraction(){
        Intent intent2 = new Intent(this, Tourist_Attraction.class);
        startActivity(intent2);
    }

    public void Photos(){
        Intent intent2 = new Intent(this, Photos.class);
        startActivity(intent2);
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
    public void Textiles(){
        Intent intent2 = new Intent(this, Textiles.class);
        startActivity(intent2);
    }
    public void LightShows(){
        Intent intent2 = new Intent(this, LightShows.class);
        startActivity(intent2);
    }
    public void Food(){
        Intent intent2 = new Intent(this, Food.class);
        startActivity(intent2);
    }
    public void MusicDance(){
        Intent intent2 = new Intent(this, MusicDance.class);
        startActivity(intent2);
    }
    public void Adventure(){
        Intent intent2 = new Intent(this, Adventure.class);
        startActivity(intent2);
    }
    public void Nature_Bhedghat(){
        Intent intent2 = new Intent(this, Nature_Bhedghat.class);
        startActivity(intent2);
    }
    public void Spiritual_Maheshwar(){
        Intent intent2 = new Intent(this, Spiritual_Maheshwar.class);
        startActivity(intent2);
    } public void Spiritual_Khajuraho(){
        Intent intent2 = new Intent(this, Spiritual_Khajuraho.class);
        startActivity(intent2);
    }
    public void Nature_Panchmarhi(){
        Intent intent2 = new Intent(this, Nature_Panchmarhi.class);
        startActivity(intent2);
    }
    public void Fort_Mandav(){
        Intent intent2 = new Intent(this, Fort_Mandav.class);
        startActivity(intent2);
    }

}