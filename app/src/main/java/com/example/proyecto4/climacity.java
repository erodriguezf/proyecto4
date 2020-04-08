package com.example.proyecto4;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class climacity {

    public static ArrayList<Ciudad> getUser(JSONObject response) {
        ArrayList<Ciudad> list = new ArrayList<>();
        try{
            JSONArray cities = response.getJSONArray("list");

            for (int i =0; i<cities.length();i++){
                JSONObject obj = cities.getJSONObject(i);
                String main = obj.getJSONObject("main").getString("temp");
                String name = obj.getString("name");
                String url1 = "https://api.openweathermap.org/data/2.5//group?id=3689147,3688689,3688465,3687925,3687238,3685533,3680656,3674962,3672486,3667849&units=metric&appid=b5ba7934ab85850c1e8b4f19cdc4cf50";
                list.add(new Ciudad(name, main,R.drawable.ic_launcher_background));
            }


        } catch (JSONException e){
            e.printStackTrace();
        }
        return list;
    }

}


