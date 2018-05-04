package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by safari on 2018/5/4.
 */

public class County extends DataSupport {
    private int id;//所在县或区的id
    private String countyName;//所在县或区的名字
    private int weatherId;//所在县或区的天气id
    private int cityId;//所在县或区的市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
