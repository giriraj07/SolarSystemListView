package com.example.girirajkishor.solarsystemlistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class PlanetAdapter extends BaseAdapter {

    private ArrayList<Planet> planets;
    private Context context;
    public PlanetAdapter(ArrayList<Planet> planets,Context context) {
        this.planets = planets;
        this.context=context;
    }

    @Override
    public int getCount() {
        return planets.size();
    }

    @Override
    public Planet getItem(int position) {
        return planets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.e("TAG","getView" +convertView);
        LayoutInflater li=LayoutInflater.from(context);
        View InflatedView;
        if(convertView==null)
        {

            InflatedView=li.inflate(R.layout.item_row,parent,false);
        }
        else
        {
         InflatedView=convertView;
        }
        bind(InflatedView,planets.get(position));
        return InflatedView;
    }
    public void bind(View inflatedView, final Planet currentPlanet){
        final TextView plName,plDistance,plRadius;
         ImageView plImage;
        plImage=inflatedView.findViewById(R.id.plImage);
        plName=inflatedView.findViewById(R.id.plName);
        plDistance=inflatedView.findViewById(R.id.plDistance);
        plRadius=inflatedView.findViewById(R.id.plRadius);

        // currentContact.getBaseContext();
        plName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,currentPlanet.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        Picasso.get().load(currentPlanet.getImageURL()).into(plImage);
    //    Picasso.with(context).load(currentPlanet.getImageURL()).into(plImage);
        plName.setText(currentPlanet.getName());
        plDistance.setText(currentPlanet.getDistance());
        plRadius.setText(currentPlanet.getRadius());
    }
}