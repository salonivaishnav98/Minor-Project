package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BookTicket extends AppCompatActivity {

    RadioButton rb1,rb2,rb3;
    Button ticketBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_ticket);
        getSupportActionBar().setTitle("Book Ticket");

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        ticketBtn = findViewById(R.id.ticketBtn);
        ticketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked()){
                    //Toast.makeText(BookTicket.this, "Train ticket", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),Ticket_Train.class);
                    startActivity(intent);

                }
                else if(rb2.isChecked()){
                    //Toast.makeText(BookTicket.this, "Bus ticket", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),Ticket_Bus.class);
                    startActivity(intent);}
                else if(rb3.isChecked()){
                    //Toast.makeText(BookTicket.this, "Flight ticket", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),Ticket_Flight.class);
                    startActivity(intent);}
                else{Toast.makeText(BookTicket.this, "Select at least one", Toast.LENGTH_LONG).show();
                }
            }});


    }
}