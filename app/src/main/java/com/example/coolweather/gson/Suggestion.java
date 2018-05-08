package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by safari on 2018/5/7.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;//舒适度指数
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;//洗车指数
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;//运动指数
    public class Sport{
        @SerializedName("txt")
        public String info;
    }



}
