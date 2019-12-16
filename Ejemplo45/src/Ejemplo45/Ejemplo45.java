/*
 Escriba una aplicación que marque los ejes de la pantalla MIDlet. 
 Enseguida dibuje un rectangulo plano, con relleno, redondeado, 
 redondeado con relleno y arcos....
 */

package Ejemplo45;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo45 extends MIDlet implements CommandListener{
    
    Display Pantalla;
    DrawMyLife Draw;
    Command Salir;
    
    public Ejemplo45(){
        Pantalla=Display.getDisplay(this);
        Draw=new DrawMyLife();
        Salir=new Command("Salir", Command.EXIT, 1);
        Draw.addCommand(Salir);
        Draw.setCommandListener(this);
    }

    public void startApp() {
        Pantalla.setCurrent(Draw);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Salir){
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
