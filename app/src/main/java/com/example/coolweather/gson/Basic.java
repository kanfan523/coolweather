package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by safari on 2018/5/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;//城市名字

    @SerializedName("id")
    public String weatherId;//城市对应的天气Id

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;//接口更新时间
    }
}
