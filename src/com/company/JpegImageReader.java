package com.company;

public class JpegImageReader extends ImageReader {
    public JpegImageReader(String image){
        this.decodedImage = new JpegDecodedImage(image);
    }
    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
