package com.example.coolweather.gson;

/**
 * Created by safari on 2018/5/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;//空气质量指数

        public String pm25;//PM2.5指数

    }
}