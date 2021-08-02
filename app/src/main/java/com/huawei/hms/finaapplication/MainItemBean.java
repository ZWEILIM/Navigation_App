package com.huawei.hms.finaapplication;
import java.io.Serializable;

public class MainItemBean implements Serializable {
    private String id;
    private String name;
    private int picture;

    public MainItemBean(String id, String name, int picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
    }

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

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
