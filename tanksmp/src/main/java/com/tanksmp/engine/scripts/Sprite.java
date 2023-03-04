package engine.scripts;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class Sprite {

    public static HashMap<String, BufferedImage> spriteHash = new HashMap<String, BufferedImage>();
    public String filePath = "";

    public Sprite(String filePath) {

        try {
            File img = new File(filePath);
            BufferedImage image = ImageIO.read(img);

            spriteHash.put(filePath, image);
        } catch (IOException e) {
            System.out.println("< WARNING > Sprite Initialization Warning: \n Sprite: '" + filePath + "' is not found.");
        }
    }
}
