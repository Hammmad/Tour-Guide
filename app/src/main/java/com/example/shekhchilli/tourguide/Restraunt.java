package com.example.shekhchilli.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Restraunt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.container,new RestruantFragment()).commit();

//        ArrayList<Location> locations = new ArrayList<Location>();
//        locations.add(new Location(R.mipmap.ic_launcher,"Habibullah", "Woooooow"));
//        locations.add(new Location(R.mipmap.ic_launcher,"Kareemullah", "paaaaaaaaapppaaaa"));
//
//        CustomArrayAdapter adapter = new CustomArrayAdapter(this,locations);
//
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

    }

}
