package Ejemplo;

public class Figuras {
    private double volumen;
    private double area;
    
    /*public Figuras(double vol, double a){
        
    }*/
    
    public double aCilindro(double radio, double altura){
        area=2*Math.PI*(altura+radio);
        return area;
    }
    
    public double vCilindro(double radio, double altura){
        volumen=Math.PI*(radio*radio)*altura;
        return volumen;
    }
    
    public double aCono(double radio, double altura){
        double generatriz;
        generatriz=Math.sqrt((altura*altura)+(radio*radio));
        area=(Math.PI*Math.PI)+Math.PI*radio*generatriz;
        //System.out.print("Generatriz = "+generatriz);
        return area;
    }
    
    public double vCono(double radio, double altura){
        volumen=(Math.PI*(radio*radio)*altura)/3;
        return volumen;
    }
    
    public double aEsfera(double radio){
        area=4*Math.PI*(radio*radio);
        return area;
    }
    
    public double vEsfera(double radio){
        volumen=(4*Math.PI/3)*(radio*radio*radio);
        return volumen;
    }
}
