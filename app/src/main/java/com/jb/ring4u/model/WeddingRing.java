package com.jb.ring4u.model;

import android.widget.TextView;
/*Immutable Object*/
public class WeddingRing {
    private final String name;
    private final String code;
    private final double price;
    private final int image;

    public WeddingRing(String name, String code, double price, int image) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
