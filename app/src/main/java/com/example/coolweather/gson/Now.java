package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by safari on 2018/5/7.
 */

public class Now {

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;//天气信息
    }

    @SerializedName("tmp")
    public String temperature;//温度；

}
