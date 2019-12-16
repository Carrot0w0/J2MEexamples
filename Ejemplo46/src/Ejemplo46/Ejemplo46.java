package Ejemplo46;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo46 extends MIDlet implements CommandListener{
    
    Display Pantalla;
    DrawMyLife Draw;
    Command Salir;
    
    public Ejemplo46(){
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
