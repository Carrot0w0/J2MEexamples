package Ejemplo46;

import javax.microedition.lcdui.*;

public class DrawMyLife extends Canvas{

    int x=getWidth()/2-40, y=getHeight()/2-53, rojo=255, verde=128, azul=128;
    
    protected void paint(Graphics g) {
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(255, 255, 0);
        g.fillRect(getWidth()/2-40, getHeight()/2-40, 80, 80);
        
        g.setColor(rojo, verde, azul);
        g.fillArc(x, y, 80, 80, 0, 360);
    }
    
    public void keyPressed(int keyCode){
        switch(keyCode){
            case KEY_NUM1:
                rojo=64;
                verde=0;
                azul=128;
                x=getWidth()/2-40;
                y=getHeight()/2-40;
                break;
            case KEY_NUM2:
                rojo=0;
                verde=255;
                azul=0;
                x=getWidth()/2;
                y=getHeight()/2-80;
                break;
            case KEY_NUM3:
                rojo=255;
                verde=0;
                azul=128;
                x=getWidth()/2+28;
                y=getHeight()/2-108;
                break;
        }
        repaint();
    }

}
