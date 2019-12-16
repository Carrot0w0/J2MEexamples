package Ejemplo39;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo39 extends MIDlet implements CommandListener{
    
    private Display Pantalla;
    private Form Menu;
    private Command Calcular;
    private Command Salir;
    private TextField Peso;
    private TextField Altura;
    private StringItem imc;
    private StringItem Clasificacion;
    private Command C;
    private double cal, peso, altura;
    private String Cla;
    private Alert Holi;
    
    public Ejemplo39(){
        Pantalla = Display.getDisplay(this);
        Menu = new Form("IMC");
        Calcular = new Command("Calcular",Command.OK,1);
        Salir = new Command("Salir",Command.EXIT,1);
        Peso = new TextField("Peso: ", "",4,TextField.DECIMAL);
        Altura = new TextField("Altura: ", "",4,TextField.DECIMAL);
        imc = new StringItem("IMC ","0.0");
        Clasificacion = new StringItem("Clasificación ","");
        C = new Command("Clasificación",Command.OK,1);
        Menu.addCommand(Salir);
        Menu.addCommand(Calcular);
        Menu.addCommand(C);
        Menu.append(Peso);
        Menu.append(Altura);
        Menu.append(imc);        
        Menu.append(Clasificacion);
        Menu.setCommandListener(this);
        cal=0;
        peso=0;
        altura=0;
        Holi = new Alert("Error","",null,AlertType.CONFIRMATION);
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
            if(c==Calcular){
                try{
                    peso=Double.parseDouble(Peso.getString());
                    altura=Double.parseDouble(Altura.getString());
                    cal=IMC.CalcularIMC(peso, altura);
                    imc.setText(" "+cal);
                }
                catch(Exception w){
                    Holi.setString("Introduzca lo que se le esta pidiendo\nNumeros pls...");
                    Pantalla.setCurrent(Holi,Menu);
                }
            }
            else{
                if(c==C){
                    try{
                        peso=Double.parseDouble(Peso.getString());
                        altura=Double.parseDouble(Altura.getString());
                        cal=IMC.CalcularIMC(peso, altura);
                        Cla=IMC.ClasificarIMC(cal);
                        Clasificacion.setText(" "+Cla);
                    }
                    catch(Exception w){
                        Holi.setString("Introduzca lo que se le esta pidiendo\nNumeros pls...");
                        Pantalla.setCurrent(Holi,Menu);
                    }
                }
            }
        }
    }
}
