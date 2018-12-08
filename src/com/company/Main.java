package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DecodedImage decodedImage;
        ImageReader imageReader = null;
        String image = "background.jpeg";
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            imageReader = new GifImageReader(image);
        }
        if (format.equals("jpeg")) {
            imageReader = new JpegImageReader(image);
        }
        decodedImage = imageReader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
