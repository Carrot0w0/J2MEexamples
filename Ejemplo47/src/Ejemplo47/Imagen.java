package Ejemplo47;

import javax.microedition.lcdui.*;

public class Imagen extends Canvas{

    private Image Img;
    private String MSG="Holo crayolo <3";
    
    protected void paint(Graphics g) {
        try{
            Img=Image.createImage("Imagen.png");
        }catch(Exception ER){}
        
        g.setColor(64, 128, 128);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(255, 0, 0);
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawImage(Img, getWidth()/2, getHeight()/2, Graphics.HCENTER|Graphics.BOTTOM);
        g.drawString(MSG, 10, 250, Graphics.LEFT|Graphics.BOTTOM);
    }
    
    public void pointerPressed(int MiX, int MiY){
        MSG="Presiono en\nValor de x "+MiX+"\nValor de Y "+MiY;
        this.repaint();
    }
    
    public void pointerDragged(int MiX, int MiY){
        MSG="Drago desde\nValor de x "+MiX+"\nValor de Y "+MiY;
        this.repaint();
    }
    
    public void pointerReleased(int MiX, int MiY){
        MSG="Solto en\nValor de x "+MiX+"\nValor de Y "+MiY;
        this.repaint();
    }

}
