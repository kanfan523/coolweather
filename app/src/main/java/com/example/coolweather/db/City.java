package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by safari on 2018/5/4.
 */

public class City extends DataSupport{
    private int id;//所在城市的id
    private String cityName;//所在城市的名字
    private int cityCode;//所在城市的代号
    private int provinceId;//所在城市的省份id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
