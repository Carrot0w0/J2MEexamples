package Gasolina;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Gas extends MIDlet implements CommandListener{
    
    private Display Pantalla;
    private Form Principal;
    private TextField Litros;
    private Command Vender;
    private Command Resurtir;
    private Command VerLitros;
    private Command Salir;
    private StringItem Tanque;
    private Alert Mensaje;
    private Gasolina G;
    private int MiL;
    
    public Gas(){
        MiL=1500;
        Pantalla=Display.getDisplay(this);
        Principal=new Form("Bienvenido");
        Litros=new TextField("Litros ", "", 4, TextField.NUMERIC);
        Vender=new Command("Vender", Command.OK, 1);
        Resurtir=new Command("Resurtir", Command.OK, 1);
        VerLitros=new Command("Ver Litros", Command.OK, 1);
        Salir=new Command("Salir", Command.EXIT, 1);
        Tanque=new StringItem("Litros en el tanque ", ""+MiL);
        Mensaje=new Alert("Aviso", "", null, AlertType.CONFIRMATION);     
        
        Principal.addCommand(Salir);
        Principal.setCommandListener(this);
        Principal.addCommand(Vender);
        Principal.addCommand(Resurtir);
        Principal.addCommand(VerLitros);
        Principal.append(Litros);
        Principal.append(Tanque);
        
        G=new Gasolina();
    }

    public void startApp() {
        Pantalla.setCurrent(Principal);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Vender){
            MiL=G.Vender(Integer.parseInt(Litros.getString()));
            Tanque.setText(""+MiL);
            Mensaje.setString("Litros en el tanque "+MiL);
            Pantalla.setCurrent(Mensaje, Principal);
            Litros.setString("");
        }
        else{
            if(c==Resurtir){
                MiL=G.Resurtir(Integer.parseInt(Litros.getString()));
                Tanque.setText(""+MiL);
                Mensaje.setString("Litros en el tanque "+MiL);
                Pantalla.setCurrent(Mensaje, Principal);
                Litros.setString("");
            }
            else{
                if(c==VerLitros){
                    if(G.GetLitros()<=500){
                        Mensaje.setString("Es necesario resurtir el tanque "+G.GetLitros()+" litros restantes en el tanque");
                        Pantalla.setCurrent(Mensaje, Principal);
                    }
                    else{
                        Mensaje.setString(""+G.GetLitros()+" litros restantes en el tanque");
                        Pantalla.setCurrent(Mensaje, Principal);
                    }
                }        
                    else{
                        if(c==Salir){
                            destroyApp(true);
                            notifyDestroyed();
                        }
                    }
                }
            }
        }
    }

