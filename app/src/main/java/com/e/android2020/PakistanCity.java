package com.e.android2020;

public class PakistanCity {
    String city;
 public PakistanCity(){}
    public PakistanCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "PakistanCity{" +
                "city='" + city + '\'' +
                '}';
    }
}
