package com.planisense.test.entity;

public class Point {
    private float lon;
    private float lat;

    public Point() {
    }

    public Point(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }
    public float getLat() {
        return lat;
    }

    public void setLon( float lon ) {
        this.lon = lon;
    }

    public void setLat( float lat ) {
        this.lat = lat;
    }
}