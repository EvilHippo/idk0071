package com.spring.player;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {

    @Id
    private long UID;
    private double x;
    private double y;

    public long getUID() {
        return UID;
    }

    public void setUID(long UID) {
        this.UID = UID;
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


    public Player(double x, double y, long UID) {

        this.x = x;
        this.y = y;
        this.UID = UID;
    }
    public Player() {

    }
}
