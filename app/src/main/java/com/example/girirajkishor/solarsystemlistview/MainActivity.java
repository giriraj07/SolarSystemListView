package com.example.girirajkishor.solarsystemlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Planet> ar=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater li=LayoutInflater.from(this);
        ar.add(new Planet("Sun","0 AU","109 AU","https://solarsystem.nasa.gov/system/downloadable_items/519_solsticeflare.jpg"));
        ar.add(new Planet("Mercury","0.39 AU","0.38 AU","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_color_-_Prockter07-edit1.jpg/1200px-Mercury_in_color_-_Prockter07-edit1.jpg"));
        ar.add(new Planet("Venus","0.72 AU","0.95 AU","https://www.google.com/search?q=venus&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi5xOyKicbfAhVEWX0KHSAfAMoQ_AUIDigB&biw=1536&bih=754#imgrc=erzmacyxYswzqM:"));
        ar.add(new Planet("Earth","1.0 AU","1.00 AU","https://geology.com/google-earth/google-earth.jpg"));
        ar.add(new Planet("Mars","1.5 AU","0.53 AU","https://www.google.com/search?q=mars&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjjytuuicbfAhUBVH0KHRAfDU0Q_AUIDigB&biw=1536&bih=754#imgrc=cyxdEv5SngtPZM:"));
        ar.add(new Planet("Jupiter","5.2 AU","11 AU","https://www.google.com/search?q=jupiter&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjaoszFicbfAhXCR30KHUf2CV0Q_AUIDigB&biw=1536&bih=754#imgrc=qullJrGX9yKIeM:"));
        ar.add(new Planet("Saturn","9.5 AU","9 AU","https://www.google.com/search?q=saturn&source=lnms&tbm=isch&sa=X&ved=0ahUKEwj9yvzXicbfAhVPfisKHT_TBFoQ_AUIDigB&biw=1536&bih=754#imgrc=dmscvRHKOjVAKM:"));
        ar.add(new Planet("Uranus","19.2 AU","4 AU","https://www.google.com/search?q=uranus&source=lnms&tbm=isch&sa=X&ved=0ahUKEwj5udjoicbfAhWZeisKHeLUDEEQ_AUIDigB&biw=1536&bih=754#imgrc=RyidZygufl-NPM:"));
        ar.add(new Planet("Neptune","30.1 AU","4 AU","https://www.google.com/search?q=neptune&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiv8Lj8icbfAhVBcCsKHTV4AbAQ_AUIDigB&biw=1536&bih=754#imgrc=Z_noXwuRXH_ZSM:"));
        ar.add(new Planet("Pluto","39.5 AU","0.18 AU","https://www.google.com/search?q=pluto&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi8huCJisbfAhVHAXIKHeyvD3EQ_AUIDigB&biw=1536&bih=754#imgrc=yEUA3mY1zOxjQM:"));

        ListView lv=findViewById(R.id.lv);
      PlanetAdapter planetadapter=new PlanetAdapter(ar,this);
      lv.setAdapter(planetadapter);
    }
}
