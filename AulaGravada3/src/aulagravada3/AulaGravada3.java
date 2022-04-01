package aulagravada3;

import java.util.Scanner;

public class AulaGravada3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com seu peso em KG:");
        double peso = entrada.nextDouble();
        
        System.out.println("Entre com sua altura em metros:");
        double altura = entrada.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.println("Seu IMC é: "+imc);
        
        if(imc<18.5){
            System.out.println("Magreza");
        }else if(imc<24.9){
            System.out.println("Normal");
        }else if(imc<29.9){
            System.out.println("Sobrepeso");
        }else if(imc<39.9){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade grave");
        }
        entrada.close();
    }
    
}
