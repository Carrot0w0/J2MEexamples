package Ejemplo42;

import javax.microedition.lcdui.*;

public class Colores extends Canvas{

    int Ro=0, Ve=0, Az=0;
    
    protected void paint(Graphics g) {
        g.setColor(Ro, Ve, Az);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void keyPressed(int keyCode){
        switch(keyCode){
            case KEY_NUM0:
                Ro=35;
                Ve=0;
                Az=45;
                break;
            case KEY_NUM1:
                Ro=255;
                Ve=0;
                Az=0;
                break;
            case KEY_NUM2:
                Ro=0;
                Ve=0;
                Az=255;
                break;
            case KEY_NUM3:
                Ro=0;
                Ve=255;
                Az=0;
                break;
            case KEY_NUM4:
                Ro=200;
                Ve=10;
                Az=50;
                break;
            case KEY_NUM5:
                Ro=20;
                Ve=64;
                Az=64;
                break;
            case KEY_NUM6:
                Ro=128;
                Ve=128;
                Az=255;
                break;
            case KEY_NUM7:
                Ro=128;
                Ve=0;
                Az=128;
                break;
            case KEY_NUM8:
                Ro=192;
                Ve=192;
                Az=192;
                break;
            case KEY_NUM9:
                Ro=255;
                Ve=128;
                Az=0;
                break;
            case KEY_POUND:
                Ro=64;
                Ve=128;
                Az=128;
                break;
            case KEY_STAR:
                Ro=55;
                Ve=8;
                Az=6;
                break;
        }
        repaint();        
    }
}
