package Ejemplo37;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class Ejemplo37 extends MIDlet implements CommandListener{
    private Display Pantalla;
    private Form FrmMenu;
    private Command BtnSalir;
    
    public Ejemplo37(){
        Pantalla=Display.getDisplay(this);
        FrmMenu=new Form("Menú Principal");
        BtnSalir=new Command("Salir", Command.EXIT, 1);
        FrmMenu.addCommand(BtnSalir);
        FrmMenu.setCommandListener(this);
    }
    
    public void startApp() {
        Pantalla.setCurrent(FrmMenu);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==BtnSalir){
            destroyApp(true);
            notifyDestroyed();
        }
    }
}
