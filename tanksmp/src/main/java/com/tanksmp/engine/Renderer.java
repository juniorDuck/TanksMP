package engine;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Renderer extends JPanel{
    public int pixelsPerUnit = 1;

    @Override 
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (GameObject obj : Scene.mainScene.objects) {
            
            

        }
    }
}
