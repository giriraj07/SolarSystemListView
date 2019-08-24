package com.example.girirajkishor.solarsystemlistview;

import android.graphics.drawable.Drawable;

public class Planet {
    private String Name,Distance,Radius,ImageURL;
// Picasso.with(context)
//            .load(ImageURL)
//                .resize(width,height).into(imageView);

    public Planet(String name,String distance ,String radius,String ImageURL) {
        this.ImageURL=ImageURL;
        this.Name = "Name :" +name;
        this.Distance="Distance from Sun :"+distance;
        this.Radius="Radius of "+ name +": "+radius;
        this.ImageURL=ImageURL;
    }
//
//    public Drawable setImageURL(String imageURL) {
//        ImageURL = imageURL;
//    }

    public String getImageURL() {
        return this.ImageURL;

    }

    public String getName() {
        return this.Name;

    }
    public String getDistance() {
        return Distance;
    }
    public String getRadius() {
        return Radius;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public void setRadius(String radius) {
        Radius = radius;
    }
}

