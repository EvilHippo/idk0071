package com.spring.platform;

public abstract class Platform {

    private double x = 0;
    private double y = 0;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    Platform(double x, double y, String picture) {
        this.x = x;
        this.y = y;
        this.picture = picture;
    }


}
