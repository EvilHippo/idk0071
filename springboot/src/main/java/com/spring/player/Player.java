package com.spring.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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


    public Player(double x, double y, String UID) {

        this.x = x;
        this.y = y;
    }
}
