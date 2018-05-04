package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by safari on 2018/5/4.
 */

public class Province extends DataSupport{
    private int id;//所在地省份Id
    private String provinceName;//所在地省份名字
    private int provinceCode;//所在地省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
