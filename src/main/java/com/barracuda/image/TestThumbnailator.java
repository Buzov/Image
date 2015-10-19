package com.barracuda.image;

import java.io.File;
import java.io.IOException;
import net.coobird.thumbnailator.Thumbnails;


public class TestThumbnailator {
    private static final String fileFolder = "./image/";
    private static final String fileName = "3";
    private static final String ext = ".jpg";
    private static final String ext2 = "jpg";
    
    public static void main(String[] args) throws IOException {
        Thumbnails.of(new File(fileFolder + fileName + ext))
        .size(886, 642)
        .toFile(new File(fileFolder + fileName + "_Thumbnails" + ext));
    }
}
