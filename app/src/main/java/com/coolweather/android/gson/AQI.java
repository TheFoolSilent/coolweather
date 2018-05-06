package com.coolweather.android.gson;

/**
 * Created by asus on 2018/5/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
