package com.company;

public class GifDecodedImage extends DecodedImage {
    public GifDecodedImage(String image){
        this.image = image;
    }

    @Override
    public String toString() {
        return super.toString() + " into gif image.";
    }
}
