package Ejemplo42;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo42 extends MIDlet implements CommandListener{

    private Display Pantalla;
    private Colores Colors;
    private Command Salir;
    
    public Ejemplo42(){
        Pantalla=Display.getDisplay(this);
        Colors=new Colores();    
        Salir=new Command("Salir", Command.EXIT, 1);
        Colors.addCommand(Salir);
        Colors.setCommandListener(this);
    }
    
    public void startApp() {
        Pantalla.setCurrent(Colors);
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
