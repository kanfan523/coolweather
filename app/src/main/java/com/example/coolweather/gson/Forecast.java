package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by safari on 2018/5/7.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;//白天天气状况
    }

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;//最高温度

        public String min;//最低温度
    }

}
