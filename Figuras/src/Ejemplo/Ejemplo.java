package Ejemplo;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo extends MIDlet implements CommandListener{
    private Display Pantalla;
    private Form Forma;
    private Command Calculo;
    private StringItem LblRes;
    private TextField TxtNum1, TxtNum2;
    private double Res=0;
    private Alert MSG;
    private Figuras Fig;
    private double radio=0;
    
    public Ejemplo(){
        Pantalla=Display.getDisplay(this);
        Fig=new Figuras();
        Forma=new Form("Calculator de suma :3");
        Calculo=new Command("Calcular",Command.OK,1);
        LblRes=new StringItem("Resultado ","0.0");
        TxtNum1=new TextField("Digite un numero ", "", 4, TextField.DECIMAL);
        TxtNum2=new TextField("Digite otro numero ", "", 4, TextField.DECIMAL);
        Forma.addCommand(Calculo);
        Forma.append(TxtNum1);
        Forma.append(TxtNum2);
        Forma.append(LblRes);
        Forma.setCommandListener(this);
        MSG=new Alert("Error","",null,AlertType.CONFIRMATION);
    }
    
    public void startApp() {
        Pantalla.setCurrent(Forma);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Calculo){
            try{
                radio=Double.parseDouble(TxtNum1.getString());
                Res=Fig.aEsfera(radio);
                //Res=Double.parseDouble(TxtNum1.getString())+Double.parseDouble(TxtNum2.getString());
                LblRes.setText(" "+Res);
            }
            catch(Exception e){
                MSG.setString("Introduzca solo numeros");
                Pantalla.setCurrent(MSG,Forma);
            }
        }
    }
}
