package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;

    private String cityName;       // 市的名称

    private int cityCode;          //id市的代码

    private int provinceId;        // 市所属的省份的

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
