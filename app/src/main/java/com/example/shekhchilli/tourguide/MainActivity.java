package com.example.shekhchilli.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestrauntClicklistener();
        MuseumClicklistener();
        PlaceClicklistener();
    }

    public void RestrauntClicklistener(){
        TextView restrauntview = (TextView) findViewById(R.id.restraunt_textview);
        restrauntview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Restraunt.class);
                startActivity(intent);
            }
        });
    }

    public void PlaceClicklistener() {
        TextView placestextView = (TextView) findViewById(R.id.places_textview);
        placestextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Places.class);
                startActivity(intent);
            }
        });

    }

    public void MuseumClicklistener() {
        TextView museumtextView = (TextView) findViewById(R.id.museum_textview);
        museumtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Musuems.class);
                startActivity(intent);
            }
        });

    }
}
