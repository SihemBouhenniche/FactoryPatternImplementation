package com.company;

public class GifImageReader extends ImageReader {
    public GifImageReader(String image){
        this.decodedImage = new GifDecodedImage(image);
    }
    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
