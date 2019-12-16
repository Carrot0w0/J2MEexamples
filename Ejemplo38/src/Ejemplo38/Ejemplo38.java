package Ejemplo38;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Ejemplo38 extends MIDlet implements CommandListener{
    private List Menu;
    private Form Frm1, Frm2, Frm3, Frm4, Frm5, Frm6;
    private Command Salir, Atras, C1, C2, C3, C4, C5, C6;
    private Display Pantalla;
    private Figuras Fig;
    private StringItem Res1,Res2,Res3,Res4,Res5,Res6,Generatriz;
    private TextField Radio1,Radio2,Radio3,Radio4,Radio5,Radio6, Altura1,Altura2,Altura3,Altura4;
    
    public Ejemplo38(){
        Pantalla=Display.getDisplay(this);
        Fig=new Figuras();
        Menu=new List("Menú",List.IMPLICIT);
        Menu.insert(0,"Área Cilindro",null);
        Menu.insert(1,"Volumen Cilindro",null);
        Menu.insert(2,"Área Cono",null);
        Menu.insert(3,"Volumen Cono",null);
        Menu.insert(4,"Área Esfera",null);
        Menu.insert(5,"Volumen Esfera",null);
        Frm1=new Form("Área Cilindro");
        Frm2=new Form("Volumen Cilindro");
        Frm3=new Form("Área Cono");
        Frm4=new Form("Volumen Cono");
        Frm5=new Form("Área Esfera");
        Frm6=new Form("Volumen Esfera");
        Salir=new Command("Salir",Command.EXIT,1);
        Atras=new Command("Atrás",Command.BACK,1);
        Menu.addCommand(Salir);
        Frm1.addCommand(Atras);
        Frm2.addCommand(Atras);
        Frm3.addCommand(Atras);
        Frm4.addCommand(Atras);
        Frm5.addCommand(Atras);
        Frm6.addCommand(Atras);
        Menu.setCommandListener(this);
        Frm1.setCommandListener(this);
        Frm2.setCommandListener(this);
        Frm3.setCommandListener(this);
        Frm4.setCommandListener(this);
        Frm5.setCommandListener(this);
        Frm6.setCommandListener(this);
        C1=new Command("Calcular",Command.OK,1);
        C2=new Command("Calcular",Command.OK,1);
        C3=new Command("Calcular",Command.OK,1);
        C4=new Command("Calcular",Command.OK,1);
        C5=new Command("Calcular",Command.OK,1);
        C6=new Command("Calcular",Command.OK,1);
        Radio1 = new TextField("Radio ","",4,TextField.DECIMAL);
        Altura1 = new TextField("Altura ","",4,TextField.DECIMAL);
        Radio2 = new TextField("Radio ","",4,TextField.DECIMAL);
        Altura2 = new TextField("Altura ","",4,TextField.DECIMAL);
        Radio3 = new TextField("Radio ","",4,TextField.DECIMAL);
        Altura3 = new TextField("Altura ","",4,TextField.DECIMAL);
        Radio4 = new TextField("Radio ","",4,TextField.DECIMAL);
        Altura4 = new TextField("Altura ","",4,TextField.DECIMAL);
        Radio5 = new TextField("Radio ","",4,TextField.DECIMAL);
        Radio6 = new TextField("Radio ","",4,TextField.DECIMAL);
        Generatriz = new StringItem("Generatriz ","0.0");
        Res1 = new StringItem("Resultado ","0.0");
        Res2 = new StringItem("Resultado ","0.0");
        Res3 = new StringItem("Resultado ","0.0");
        Res4 = new StringItem("Resultado ","0.0");
        Res5 = new StringItem("Resultado ","0.0");
        Res6 = new StringItem("Resultado ","0.0");
        Frm1.addCommand(C1);
        Frm2.addCommand(C2);
        Frm3.addCommand(C3);
        Frm4.addCommand(C4);
        Frm5.addCommand(C5);
        Frm6.addCommand(C6);
        Frm1.append(Radio1);
        Frm1.append(Altura1);
        Frm2.append(Radio2);
        Frm2.append(Altura2);
        Frm3.append(Radio3);
        Frm3.append(Altura3);
        Frm4.append(Radio4);
        Frm4.append(Altura4);
        Frm5.append(Radio5);
        Frm6.append(Radio6);
        Frm3.append(Generatriz);
        Frm1.append(Res1);
        Frm2.append(Res2);
        Frm3.append(Res3);
        Frm4.append(Res4);
        Frm5.append(Res5);
        Frm6.append(Res6);
    }
    
    public void startApp() {
        Pantalla.setCurrent(Menu);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==Menu.SELECT_COMMAND){
            switch(Menu.getSelectedIndex()){
                case 0:
                    Pantalla.setCurrent(Frm1);
                    break;
                case 1:
                    Pantalla.setCurrent(Frm2);
                    break;
                case 2:
                    Pantalla.setCurrent(Frm3);
                    break;
                case 3:
                    Pantalla.setCurrent(Frm4);
                    break;
                case 4:
                    Pantalla.setCurrent(Frm5);
                    break;
                case 5:
                    Pantalla.setCurrent(Frm6);
                    break;
            }
        }
        else{
            if(c==C1)
                Res1.setText(" "+Fig.aCilindro(Double.parseDouble(Radio1.getString()), Double.parseDouble(Altura1.getString())));
            else{
                if(c==C2)
                    Res2.setText(" "+Fig.vCilindro(Double.parseDouble(Radio2.getString()), Double.parseDouble(Altura2.getString())));
                else{
                    if(c==C3){
                        Generatriz.setText(" "+Fig.Gen(Double.parseDouble(Radio3.getString()), Double.parseDouble(Altura3.getString())));
                        Res3.setText(" "+Fig.aCono(Double.parseDouble(Radio3.getString()), Double.parseDouble(Altura3.getString())));
                    }
                    else{
                        if(c==C4)
                            Res4.setText(" "+Fig.vCono(Double.parseDouble(Radio4.getString()), Double.parseDouble(Altura4.getString())));
                        else{
                            if(c==C5)
                                Res5.setText(" "+Fig.aEsfera(Double.parseDouble(Radio5.getString())));
                            else{
                                if(c==C6)
                                    Res6.setText(" "+Fig.aEsfera(Double.parseDouble(Radio6.getString())));
                                else{
                                    if(c==Atras)
                                        Pantalla.setCurrent(Menu);
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
                }
            }
        }
    }
}
