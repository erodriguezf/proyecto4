package com.example.proyecto4;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Diasemana {
    public String name = "";
    public double temp = 0;

    public static ArrayList<Diasemana> getCityFore(JSONObject response, int type) {
        ArrayList<Diasemana> list = new ArrayList<>();

        switch (type) {
            case 1:


                try {
                    JSONObject cityArray = response.getJSONObject("city");
                    JSONArray ListOb = response.getJSONArray("list");
                    String cityname = cityArray.getString("name");
                    Log.d("ciudada", "funciona" + cityname + " ; ");

                    for (int i = 0; i < ListOb.length(); i++) {
                        Diasemana tempo = new Diasemana();
                        tempo.name = cityname;
                        tempo.temp = ListOb.getJSONObject(i).getJSONObject("main").getDouble("temp");
                        list.add(tempo);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            case 2:

                try {

                    JSONObject ListOb = response.getJSONObject("main");
                    String cityname = response.getString("name");
                    Log.d("Randd2", "funciona" + cityname + " ; ");

                    Diasemana tempo = new Diasemana();
                    tempo.name = cityname;
                    tempo.temp = ListOb.getDouble("temp");
                    list.add(tempo);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
        }

        return list;
    }

}
