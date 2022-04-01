package aulagravada4;

import java.util.Scanner;

public class AulaGravada4 {
    
    public static void calculoImc(double peso, double altura){
        double[] pesosImc = {18.5,24.9,29.9,39.9,9000000};
        String[] classificacoes = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
        double imc = peso/(altura*altura);
        
        int i=0;
        while(imc>pesosImc[i]){
            i++;
        }
        System.out.println("O seu IMC é: "+imc);
        System.out.println("A classificação é: "+classificacoes[i]);
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = entrada.nextDouble();
        
        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();
        
        calculoImc(peso, altura);
        
        entrada.close();
    }
    
}
