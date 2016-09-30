package com.example.shekhchilli.tourguide;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shekh chilli on 9/28/2016.
 */
public class CustomArrayAdapter extends ArrayAdapter {
    int mcolorResId;


    public CustomArrayAdapter(Context context,ArrayList<Location> location, int color) {
        super(context, 0, location);
        mcolorResId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Location currentlocation = (Location) getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView mNametextView = (TextView)convertView.findViewById(R.id.name_location);
        mNametextView.setText(currentlocation.getName());

        TextView mDescriptionTextView = (TextView) convertView.findViewById(R.id.desc_location);
        mDescriptionTextView.setText(currentlocation.getDescription());

        ImageView imageView = (ImageView)convertView.findViewById(R.id.image_location);
        imageView.setImageResource(currentlocation.getImage());


        View textContainer = (View) convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mcolorResId);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
