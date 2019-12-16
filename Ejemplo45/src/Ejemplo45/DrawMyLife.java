package Ejemplo45;

import javax.microedition.lcdui.*;

public class DrawMyLife extends Canvas{

    protected void paint(Graphics g) {
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(255, 0, 0);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g.setColor(0, 0, 255);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        
        g.setColor(174, 9, 198);
        g.setStrokeStyle(Graphics.DOTTED);
        g.drawRect(getWidth()/2-70, getHeight()/2-70, 140, 140);
        g.setColor(247, 214, 136);
        g.fillRect(getWidth()/2-65, getHeight()/2-65, 130, 130);
        g.setColor(19, 187, 133);
        g.fillRoundRect(getWidth()/2-50, getHeight()/2-50, 100, 100, 30, 30);
        g.setColor(255, 255, 0);
        g.fillArc(getWidth()/2-25, getHeight()/2-25, 50, 50, 0, 300);
        
        g.setColor(0, 0, 0);
        g.drawString("Holi Crayoli <3", getWidth()/2, getHeight()/2, Graphics.BASELINE|Graphics.HCENTER);
    }
    
}
