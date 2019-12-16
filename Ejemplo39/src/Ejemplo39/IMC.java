package Ejemplo39;

public class IMC {
    
    public static double CalcularIMC(double Peso, double Altura){
        double Imc=0;
        
        Imc=Peso/(Altura*Altura);
        
        return Imc;
    }
    
    public static String ClasificarIMC(double imc){
        String Clasif="";
        
        if(imc<18)
            Clasif="Peso Bajo; Valorar signos de desnutrucion";
        else{
            if(imc<25)
                Clasif="Normal";
            else{
                if(imc<27)
                    Clasif="Sobrepeso";
                else{
                    if(imc<30)
                        Clasif="Obesidad grado 1; Riesgo alto para desarrollar enfermedades cordiovasculares";
                    else{
                        if(imc<40)
                            Clasif="Obesidad grado 2; Riesgo realmente alto para desarrollar enfermedades cordiovasculares";
                        else{
                            Clasif="Obesidad grado 1; Riesgo extremadamente alto para el desarrollo de enfermedades cordiovasculares";
                        }
                    }
                }
            }
        }
        
        return Clasif;
    }
}
