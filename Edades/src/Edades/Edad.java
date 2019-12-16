package Edades;

public class Edad {
    
    public static String Clasificar(int año){
        String Cla="";
        
        if(año>=0 && año<=6)
            Cla="Infancia";
        else{
            if(año<=12)
                Cla="Niñez";
            else{
                if(año<=18)
                    Cla="Adolescencia";
                else{
                    if(año<=25)
                        Cla="No se que va :v";
                    else{
                        if(año<=60)
                            Cla="Adultez";
                        else
                            Cla="Ancianidad";
                    }
                    
                }
            }
        }
        
        return Cla;
    }
}
