package Ejercicio40;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.*;

public class Ejercicio40 extends MIDlet implements CommandListener{
    
    private Display Pantalla;
    private Form Principal;
    private Command Salir;
    private ImageItem Equipo;
    private Image TalEquipo;
    private String Descripcion;
    
    public Ejercicio40(){
        Pantalla=Display.getDisplay(this);
        Principal=new Form("Mi equipo");
        Salir=new Command("Salir", Command.EXIT, 1);        
        Equipo=new ImageItem("", null, ImageItem.LAYOUT_CENTER|ImageItem.LAYOUT_NEWLINE_AFTER, "");     
        
    }

    public void startApp() {
        try{
            Descripcion="\nHistoria\nLalalalalalalalalalalalalala \n\n :3 y una linda carita feliz";  
            TalEquipo=Image.createImage("tumblr_m3290qKpiN1r0x6hio1_500 - copia.jpg");        
            Equipo.setImage(TalEquipo);
            Principal.deleteAll();
            Principal.append(Equipo);
            Principal.append(Descripcion);
            Principal.addCommand(Salir);
            Principal.setCommandListener(this);
        }
        catch(Exception E){
        }
        Pantalla.setCurrent(Principal);
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
