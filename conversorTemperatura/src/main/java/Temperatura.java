//NEEEWW THIIINGG - HERANÇA - HERDAR AS CARACTERÍSTICAS DE OUTRA CLASSE EM UMA SUPER CLASSE
public class Temperatura {
    //ATRIBUTOS QUE PRIVATESS
    private double graus;
    
    //CONSTRUTOR QUE TE OBRIGA A POR UM VALOR PRA VARIAVEL GRAUS
    public Temperatura(double valorTemp){
        this.graus = valorTemp;
    }
    
    //GETTER
    public double getGraus(){
        return graus;
    }
    
    //SETTER
    public void setGraus(double novoGraus){
        this.graus = novoGraus;
    }
}