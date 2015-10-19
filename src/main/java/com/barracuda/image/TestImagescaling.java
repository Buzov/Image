package com.barracuda.image;

import com.mortennobel.imagescaling.ResampleOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author artur
 */
public class TestImagescaling {
    
    private static final String fileFolder = "./image/";
    private static final String fileName = "4";
    private static final String ext = ".jpg";
    private static final String ext2 = "jpg";
    
    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File(fileFolder + fileName + ext));
	BufferedImage image = new ResampleOp(2500, 1667).filter(inputImage, null);
        ImageIO.write(image, ext2, new File(fileFolder + fileName + "_50%_Imagescaling" + ext));
    }
}
