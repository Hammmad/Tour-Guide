package com.example.shekhchilli.tourguide;


import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
public class RestruantFragment extends Fragment {


    public RestruantFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list,container,false);
         final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.drawable.restaurant_cafe_aylanto,"Cafe Ayalanto", "M M Alam Road",31.518318, 74.352561));
        locations.add(new Location(R.drawable.restaurant_chinese,"Yum Chinese & Thai", "Sir Syed Road",31.521192, 74.348383));
        locations.add(new Location(R.drawable.restaurant_exotic,"Options - An Exotic", "Heights Plaza Garden. Lahore",31.501998, 74.317408));
        locations.add(new Location(R.drawable.restaurant_fujiyaama,"Fujiyama Restaurant", "87 Ferozpur Road",31.5584755,74.3278799));
        locations.add(new Location(R.drawable.restaurant_mughlai,"Al-Raaya Mughlai Restaurant", "25 Mian Mehmood Ali Kasoori Rd.",31.509543, 74.354372));
        locations.add(new Location(R.drawable.restaurant_tabaq,"Tabaq", "57-D-1 Gulberg III, Lahore",31.517485, 74.353802));
        locations.add(new Location(R.drawable.resturaunt_banera,"Banera, Rooftop", "H Block Commercial market",31.447485, 74.215854));
        locations.add(new Location(R.drawable.resturaunt_cosa_nostra,"Cosa Nostra", "23-A H Block Gulberg II",31.527256, 74.352558));
        locations.add(new Location(R.drawable.resturaunt_salt_pepper,"Salt' n Pepper Grill", "1-Q Gulberg II, Near Ufone Office",31.512393, 74.349635));
        locations.add(new Location(R.drawable.resturaunt_ziafat,"Ziafat", "M M Alam Rd,Block C-1 Gilberg, Lahore",31.505024, 74.347851));

        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),locations,R.color.colorRstaurant);

        ListView listView = (ListView)rootview.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Location location = locations.get(position);
                double latitude = location.getlatitude();
                double longitude = location.getlongitude();
                String label = location.getName();
                String uriBegin = "geo:" + latitude + "," + longitude;
                String query = latitude + "," + longitude + "("+label+")";
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
