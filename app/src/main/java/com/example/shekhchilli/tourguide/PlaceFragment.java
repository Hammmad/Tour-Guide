package com.example.shekhchilli.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends Fragment {


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list, container,false);

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.drawable.place_badshahi_mosque,"Badshahi Mosque",""));
        locations.add(new Location(R.drawable.place_bhatti_gate,"Bhati Gate",""));
        locations.add(new Location(R.drawable.place_lahore_fort,"Lahore Fort",""));
        locations.add(new Location(R.drawable.place_lahori_gate,"Lohari Gate, Lahore",""));
        locations.add(new Location(R.drawable.place_masti_gate,"Masti Gate",""));
        locations.add(new Location(R.drawable.place_noorjahan_tomb,"Tomb of Noor Jahan",""));
        locations.add(new Location(R.drawable.place_shalimaar,"Shalimar Bagh",""));
        locations.add(new Location(R.drawable.place_tomb_jahangir,"Jahangir's Tomb",""));
        locations.add(new Location(R.drawable.place_wazir_khan,"Masjid Wazir Khan",""));


        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),locations, R.color.colorPlaces);
        ListView listView = (ListView)rootview.findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        return rootview;
    }

}
