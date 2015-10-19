package com.barracuda.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import static org.imgscalr.Scalr.*;
import org.imgscalr.Scalr.Method;

/**
 *
 * @author artur
 */
public class TestImgscalr {
    
    private static final String fileFolder = "./image/";
    private static final String fileName = "3";
    private static final String ext = ".jpg";
    private static final String ext2 = "jpg";

    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(fileFolder + fileName + ext));
        BufferedImage image = createThumbnail(originalImage, 0.50);
        
        ImageIO.write(image, ext2, new File(fileFolder + fileName + "_50%" + ext));
        /*ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, ext2, baos);
        String base64 = Base64.encode(baos.toByteArray());
        System.out.println(base64);*/
    }

    public static BufferedImage createThumbnail(BufferedImage img, int width, int height) {
        // Create quickly, then smooth and brighten it.
        img = (BufferedImage) resize(img, Method.BALANCED, width, height, OP_ANTIALIAS);

        // Let's add a little border before we return result.pad(img, 4);
        return img;
    }
    
    public static BufferedImage createThumbnail(BufferedImage img, double percent) {
        int scaledWidth = (int) (img.getWidth() * percent);
        int scaledHeight = (int) (img.getHeight() * percent);
        // Create quickly, then smooth and brighten it.
        return (BufferedImage) createThumbnail(img, scaledWidth, scaledHeight);
    }
    
    
}
