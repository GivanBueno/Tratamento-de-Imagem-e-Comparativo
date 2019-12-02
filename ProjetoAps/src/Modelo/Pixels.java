package Modelo;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;


public class Pixels
{
    private static final Component OBSERVER = new Component() {};

    public static int[] getPixels(BufferedImage img) 
    {
	final int width = img.getWidth(OBSERVER);
	final int height = img.getHeight(OBSERVER);
	int size = width * height;
	PixelGrabber pixelGrabber = new PixelGrabber(img, 0, 0, width, height, new int[size], 0, width);
	pixelGrabber.startGrabbing();
	return (int[]) pixelGrabber.getPixels();
    }
}
