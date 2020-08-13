package com.e.android2020;

import java.io.Serializable;

public class data implements Serializable {
    String item;
    int quantity;
    double price;

    public data() {
    }

    public data(String item,int quantity,double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "data{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
