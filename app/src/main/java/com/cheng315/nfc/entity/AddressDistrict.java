package com.cheng315.nfc.entity;

import com.efeiyi.Entity;

import java.io.Serializable;

public class AddressDistrict extends Entity implements Serializable {

    private String id;
    private String name;
    private String cityId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
