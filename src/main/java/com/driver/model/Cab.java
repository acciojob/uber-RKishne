package com.driver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Cab")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int perKmRate;
    private boolean available;

    public Cab() {
    }

    public Cab(int id, int perKmRate, boolean avilable) {
        Id = id;
        this.perKmRate = perKmRate;
        this.available = avilable;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @OneToOne
    @JoinColumn
    @JsonIgnore
    private Driver driver;
}