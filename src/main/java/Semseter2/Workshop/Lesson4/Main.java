package Semseter2.Workshop.Lesson4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[]args){
        try {
            File file=new File("C:\\Users\\Shira\\Pictures\\597.jpg");
            if(file.exists()){
                System.out.println("Exists");
                BufferedImage bufferedImage= ImageIO.read(file);
                for(int x=0; x<bufferedImage.getWidth(); x++){
                    for (int y=0; y<bufferedImage.getHeight();y++){
                      Color currentPixelColor;
                    }




                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
