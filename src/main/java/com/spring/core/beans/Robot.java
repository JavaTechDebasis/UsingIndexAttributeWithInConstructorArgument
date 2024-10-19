package com.spring.core.beans;

public class Robot {
    private int id;
    private String name;
    private String type;
    private String manufacturerName;
    private int model;

    public Robot(int id, String name, String type, String manufacturerName, int model) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.manufacturerName = manufacturerName;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setType() {
        return type;
    }

    public void getType(String type) {
        this.type = type;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Robot [" + id +
                ", " + name +
                ", " + type +
                ", " + manufacturerName +
                ", " + model +
                "]";
    }
}
