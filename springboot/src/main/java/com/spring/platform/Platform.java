package com.spring.platform;

public abstract class Platform {

    private int id = 0;
    private double x = 0;
    private double y = 0;


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

    Platform(double x, double y) {
        this.x = x;
        this.y = y;
    }


}
