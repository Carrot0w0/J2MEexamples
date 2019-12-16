package Ejemplo41;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.io.*;

public class Ejemplo41 extends MIDlet implements CommandListener{
    
    private Display Pantalla;
    private List Menu;
    private Form Comidas;
    private Command Salir, Atras;
    private ImageItem Comida;
    private Image MiComida;
    private String Holi;
    
    public Ejemplo41(){
        Pantalla=Display.getDisplay(this);
        Menu=new List("Comidas Mexicanas", List.IMPLICIT);
        Menu.insert(0, "Tacos <3", null);
        Menu.insert(1, "Tamales :3", null);
        Menu.insert(2, "Chilaquiles :D", null);
        Menu.insert(3, "Enchiladas :O", null);
        Menu.insert(4, "Zacahuil", null);
        Salir=new Command("Salir", Command.EXIT, 1);
        Atras=new Command("Atras", Command.BACK, 1);
        Menu.addCommand(Salir);
        Menu.setCommandListener(this);                         
        Comidas=new Form("");
        Comida=new ImageItem("", null, ImageItem.LAYOUT_CENTER|ImageItem.LAYOUT_NEWLINE_AFTER, "");
    }

    public void startApp() {
        Pantalla.setCurrent(Menu);
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
        else{
            if(c==Atras){
                Pantalla.setCurrent(Menu);
            }
            else{
                if(c==Menu.SELECT_COMMAND){
                    switch(Menu.getSelectedIndex()){
                        case 0:
                            Comidas.setTitle("Tacos :3");
                            try {   
                                MiComida=Image.createImage("Tacos.png");                                
                            } 
                            catch (Exception ERR) {
                                
                            }   
                            Comida.setImage(MiComida);
                            Holi="Los tacos tienen tortilla y carne o algo adentro, se hace rollito y ya :3";
                            Comidas.deleteAll();
                            Comidas.append(Comida);
                            Comidas.append(Holi);
                            Comidas.addCommand(Atras);   
                            Comidas.setCommandListener(this);
                            Pantalla.setCurrent(Comidas);
                            break;
                        case 1:
                            Comidas.setTitle("Tamales <3");
                            try {   
                                MiComida=Image.createImage("Tamales.jpg");                                
                            } 
                            catch (Exception ERR) {
                                
                            }   
                            Comida.setImage(MiComida);
                            Holi="Los tamales son masa que de relleno contienen carne, o algun guisado. \nPueden existir dulces los cuales tienen otro color y el relleno es algo dulce. \nEstan envueltos en una hoja de platano.";
                            Comidas.deleteAll();
                            Comidas.append(Comida);
                            Comidas.append(Holi);
                            Comidas.addCommand(Atras);   
                            Comidas.setCommandListener(this);
                            Pantalla.setCurrent(Comidas);
                            break;
                        case 2:
                            Comidas.setTitle("Chilaquiles *-*");
                            try {   
                                MiComida=Image.createImage("Chilaquiles.jpg");                                
                            } 
                            catch (Exception ERR) {
                                
                            }   
                            Comida.setImage(MiComida);
                            Holi="Totopos de tortilla tostada que estan cubiertos de salsa.\nSe decoran o acompañan con queso y crema.";
                            Comidas.deleteAll();
                            Comidas.append(Comida);
                            Comidas.append(Holi);
                            Comidas.addCommand(Atras);   
                            Comidas.setCommandListener(this);
                            Pantalla.setCurrent(Comidas);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                }
            }
        }
    }
}
