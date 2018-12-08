package com.company;

public class JpegDecodedImage extends DecodedImage {
    public JpegDecodedImage (String image){
        this.image = image;
    }

    @Override
    public String toString() {
        return super.toString() + " into jpeg image.";
    }
}
