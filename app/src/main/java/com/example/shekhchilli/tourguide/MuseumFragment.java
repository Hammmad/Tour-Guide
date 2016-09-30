package com.example.shekhchilli.tourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list, container,false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.drawable.museum_faqirkhana,"Fakir Khana Museum","Bazaar e Hakiman, Bhatti Gate"));
        locations.add(new Location(R.drawable.museum_tollinton,"Tollinton Market","Mall Road"));
        locations.add(new Location(R.drawable.museum_national,"Lahore Museum","Mall Road"));

        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),locations, R.color.colorMuseum);
        ListView listView = (ListView)rootview.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location location = locations.get(position);

                double latitude = 31.587972;
                double longitude = 74.310712;
                String label = "Badshahi Mosque";
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "(" + label + ")";
                String encodedQuery = Uri.encode(query);
                String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });



        return rootview;
    }

}
