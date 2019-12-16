package Gasolina;

public class Gasolina {
    
    private int Litros;
    
    public Gasolina(){
        Litros=1500;
    }
    
    public int Vender(int Venta){
        if(Venta<=Litros)
            Litros=Litros-Venta;
        return Litros;
    }
    
    public int Resurtir(int Llenado){
        if(Llenado<=(2000-Litros))
            Litros=Litros+Llenado;
        return Litros;
    }
    
    public int GetLitros(){
        return Litros;
    }
}
