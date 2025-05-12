public class Fahrenheit extends Temperatura{
    
    public Fahrenheit(double graus){
        super(graus); // //O SUPER PEGA A INFORMAÇÃO DE KELVIN E MANDA PRA SUPER CLASSE TEMPERATURA
    }
    
    // CONVERTER PARA CELSIUS
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    
    // CONVERTER PARA KELVIN
    public double paraKelvin(){
        return (getGraus()-32)*5/9+273.15;
        //return paraCelsius()+273.15;
    }
}