import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args){
        
        //try - PARA REFAZER MESMO ERRANDO O COMANDO (ex.: se digitar string no lugar de int em vez do código dar erro e fechar ele aparece uma mensagem de erro e repete o código pra voce digitar o certo.)
    try(Scanner scanner = new Scanner(System.in)){
        
        while(true){
            System.out.println("*************************");
            System.out.println("Qual a temperatura original? ");
            System.out.println("1. Celsius");
            System.out.println("2. Kelvin");
            System.out.println("3. Fahrenheit");
            System.out.println("4. Sair");
            System.out.println("*************************");
            System.out.print("Digite a opcao de 1 a 4: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            
            switch (opcao){
                case 1 -> {
                    Celsius celsius = new Celsius(temperatura);
                    System.out.println("=== Convertendo ===");
                    System.out.println("Fahrenheit: "+celsius.paraFahrenheit());
                    System.out.println("Kelvin: "+celsius.paraKelvin());
                }
                
                case 2 -> {
                    Kelvin kelvin = new Kelvin(temperatura);
                    System.out.println("=== Convertendo ===");
                    System.out.println("Celsius: "+kelvin.paraCelsius());
                    System.out.println("Fahrenheit: "+kelvin.paraFahrenheit());
                }
                
                case 3 -> {
                    Fahrenheit fahrenheit = new Fahrenheit(temperatura);
                    System.out.println("=== Convertendo ===");
                    System.out.println("Celsius: "+fahrenheit.paraCelsius());
                    System.out.println("Kelvin: "+fahrenheit.paraKelvin());
                }
                
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                
                default -> {
                    System.out.println("Opcao invalida.");
                    /*continue;*/
                }
            }
        }
    }catch (Exception e){
        System.out.println("Dados incorretos digitados.");
    }
    }
}
