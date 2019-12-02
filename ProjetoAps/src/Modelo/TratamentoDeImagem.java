package Modelo;

import java.awt.image.BufferedImage;

public class TratamentoDeImagem
{
    public static void TratamentoEmCinza(BufferedImage img) 
    {
        for (int x = 0; x < img.getWidth(); ++x)
        for (int y = 0; y < img.getHeight(); ++y)
        {
            int rgb = img.getRGB(x, y);
            int r = (rgb >> 16) & 0xFF;
            int g = (rgb >> 8) & 0xFF;
            int b = (rgb & 0xFF);

            // Normalize and gamma correct:
            float rr = (float) Math.pow(r / 255.0, 2.2);
            float gg = (float) Math.pow(g / 255.0, 2.2);
            float bb = (float) Math.pow(b / 255.0, 2.2);

            // Calculate luminance:
            float lum = (float) (0.2126 * rr + 0.7152 * gg + 0.0722 * bb);

            // Gamma compand and rescale to byte range:
            int grayLevel = (int) (255.0 * Math.pow(lum, 1.0 / 2.2));
            int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
            img.setRGB(x, y, gray);
        }
    }
}
