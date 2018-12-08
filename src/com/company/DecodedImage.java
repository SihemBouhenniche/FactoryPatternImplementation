package com.company;

public abstract class DecodedImage {
    protected String image;

    @Override
    public String toString() {
        return "Image : "+image+" is decoded";
    }
}
