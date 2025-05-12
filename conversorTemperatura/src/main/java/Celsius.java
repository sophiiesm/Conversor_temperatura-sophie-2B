public class Celsius extends Temperatura{
    
    public Celsius(double graus){
        super(graus);//O SUPER PEGA A INFORMAÇÃO DE CELSIUS E MANDA PRA SUPER CLASSE TEMPERATURA
    }
    
    // CONVERTER PARA KELVIN
    public double paraKelvin(){
        return getGraus()+273.15;
    }
    
    // CONVERTER PARA FAHRENHEI
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }
}