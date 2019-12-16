package Ejemplo47;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo47 extends MIDlet implements CommandListener{

    private Display Pantalla;
    private Imagen Canvas;
    private Command Salir;
    
    public Ejemplo47(){
        Pantalla=Display.getDisplay(this);
        Canvas= new Imagen();
        Salir=new Command("Salir", Command.EXIT, 1);
        Canvas.addCommand(Salir);
        Canvas.setCommandListener(this);
    }
    
    public void startApp() {
        Pantalla.setCurrent(Canvas);
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
