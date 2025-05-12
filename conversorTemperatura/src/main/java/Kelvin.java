public class Kelvin extends Temperatura {
    
    public Kelvin(double graus){
        super(graus); //O SUPER PEGA A INFORMAÇÃO DE KELVIN E MANDA PRA SUPER CLASSE TEMPERATURA
    }
    
    //CONVERTER PARA CELSIUS
    public double paraCelsius(){
        return getGraus()-273.15;
    }
    
    //CONVERTER PARA FAHRENHEIT
    public double paraFahrenheit(){
        return ((getGraus()-273.15)*9/5)+32;
    }
}