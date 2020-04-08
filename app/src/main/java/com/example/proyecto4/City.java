package com.example.proyecto4;

import com.example.proyecto4.model.Coord;
import com.google.gson.annotations.SerializedName;

import kotlin.reflect.KVisibility;

public class City {
    @SerializedName("timezone")
    private int timezone;
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("cod")
    private int cod;
    @SerializedName("coord")
    private Coordinates coord;
    @SerializedName("weather")
    private Weather[] weather;
    @SerializedName("base")
    private String base;
    @SerializedName("main")
    private Main main;
    @SerializedName("visibility")
    private int visibility;
    @SerializedName("wind")
    private Wind wind;
    @SerializedName("clouds")
    private Clouds clouds;
    @SerializedName("dt")
    private int dt;
    @SerializedName("sys")
    private Sys sys;

    public City(
            Coordinates coord,
            Weather[] weather,
            String base,
            Main main,
            int visibility,
            Wind wind,
            Clouds clouds,
            int dt,
            Sys sys,
            int timezone,
            int id,
            String name,
            int cod
    ) {
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
    }

    City() {
        this.timezone = 0;
        this.id = 0;
        this.name = "";
        this.cod = 0;
        this.coord = null;
        this.weather = null;
        this.base = "";
        this.main = new Main();
        this.visibility = 0;
        this.wind = null;
        this.clouds = null;
        this.dt = 0;
        this.sys = null;
    }

    public Main getMain() {
        return main;
    }
}

class Coordinates {
    @SerializedName("lon")
    private double lon;
    @SerializedName("lat")
    private double lat;

    public Coordinates(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }
}

class Weather {
    @SerializedName("id")
    private int id;
    @SerializedName("main")
    private String main;
    @SerializedName("description")
    private String description;
    @SerializedName("icon")
    private String icon;

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
}

class Main {
    @SerializedName("temp")
    private double temp;
    @SerializedName("feels_like")
    private double feels_like;
    @SerializedName("temp_min")
    private  double temp_min;
    @SerializedName("temp_max")
    private  double temp_max;
    @SerializedName("pressure")
    private  int pressure;
    @SerializedName("humidity")
    private  int humidity;

    public Main(int temp, int feels_like, int temp_min, int temp_max, int pressure, int humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Main() {
        this.temp = 0.0;
        this.feels_like = 0.0;
        this.temp_min = 0.0;
        this.temp_max = 0.0;
        this.pressure = 0;
        this.humidity = 0;
    }

    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }
}

class Wind {
    @SerializedName("speed")
    private double speed;
    @SerializedName("deg")
    private int deg;

    public Wind(double speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }
}

class Clouds {

    @SerializedName("all")
    private int all;

    Clouds(int all) {
        this.all = all;
    }
}

class Sys {
    @SerializedName("type")
    private int type;
    @SerializedName("id")
    private  int id;
    @SerializedName("country")
    private String country;
    @SerializedName("sunrise")
    private int sunrise;
    @SerializedName("sunset")
    private int sunset;

    public Sys(int type, int id, String country, int sunrise, int sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}
