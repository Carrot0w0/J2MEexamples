package Edades;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Edades extends MIDlet implements CommandListener{
    
    private Display Pantalla;
    private Form Principal;
    private TextField Cantidad;
    private Command Clasificar, Salir;
    private Alert Mensaje;
    private StringItem Clasificacion;
    private String MiEdad;
    
    public Edades(){
        Pantalla=Display.getDisplay(this);
        Principal=new Form("Bienvenido");
        Cantidad=new TextField("Edad","", 3, TextField.NUMERIC);
        Clasificar=new Command("Clasificar", Command.OK, 1);
        Mensaje=new Alert("Clasificacion", "", null, AlertType.CONFIRMATION);
        Clasificacion=new StringItem("Clasificacion ", "");
        Salir=new Command("Salir", Command.EXIT, 1);
        
        Principal.addCommand(Clasificar);
        Principal.addCommand(Salir);
        Principal.append(Cantidad);
        Principal.append(Clasificacion);
        Principal.setCommandListener(this);
        
        MiEdad="";
    }

    public void startApp() {
        Pantalla.setCurrent(Principal);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Clasificar){
            MiEdad=Edad.Clasificar(Integer.parseInt(Cantidad.getString()));
            Clasificacion.setText(""+MiEdad);
            Mensaje.setString(""+MiEdad);
            Pantalla.setCurrent(Mensaje, Principal);
        }
        else{
            if(c==Salir){
                destroyApp(true);
                notifyDestroyed();
            }
        }
    }
}
