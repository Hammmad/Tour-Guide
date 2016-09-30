package com.example.shekhchilli.tourguide;

import android.graphics.Point;

import java.util.ArrayList;

/**
 * Created by shekh chilli on 9/28/2016.
 */
public class Location {

    private int mimage;
    private String mname;
    private String mdescription;
    private double mlatitude;
    private double mlongitude;

    public double getlatitude() {
        return mlatitude;
    }

    public double getlongitude() {
        return mlongitude;
    }

    public int getImage() {
        return mimage;
    }

    public String getName() {
        return mname;
    }

    public String getDescription() {
        return mdescription;
    }

    public Location(int image, String name, String description){

        mimage = image;
        mname = name;
        mdescription = description;

    }

    public Location(int image, String name, String description, double latitude, double longitude){

        mimage = image;
        mname = name;
        mdescription = description;
        mlatitude = latitude;
        mlongitude = longitude;
    }
}
