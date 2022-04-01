package aulagravada5;

import java.util.Scanner;

public class AulaGravada5 {
    public static void calculaImc(double peso, double altura){
        double[] pesoImc = {18.5,24.9,29.9,39.9,900000};
        String[] classificacoes = {"Magreza","Normal","Sobrepeso","Obesidade","Obesidade Grave"};
        
        double imc = peso/(altura*altura);
        System.out.println("O imc é: "+imc);
        
        int i=0;
        while(imc>pesoImc[i]){
            i++;
        }
        System.out.println("A classificação é: "+classificacoes[i]+"\n");
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean loop = true;
//        while(loop){
//            System.out.println("Deseja calcular um novo IMC? (1=sim, 0=não)");
//            int resposta = entrada.nextInt();
//            switch (resposta) {
//                case 1:
//                    System.out.println("Entre com o Peso em KG: ");
//                    double peso = entrada.nextDouble();
//                    System.out.println("Entre com a Altura em Metros: ");
//                    double altura = entrada.nextDouble();
//                    calculaImc(peso, altura);
//                    break;
//                case 0:
//                    loop=false;
//                    break;
//                default:
//                    System.out.println("Entrada inválida.");
//                    break;
//            }
//        }
        while(loop){
            System.out.println("Deseja calcular um novo IMC? (s/n)");
            String resposta = entrada.next();
            if(resposta.equalsIgnoreCase("s")){
                System.out.println("Entre com o seu peso em KG: ");
                double peso = entrada.nextDouble();
                System.out.println("Entre com sua altura em Metros: ");
                double altura = entrada.nextDouble();
                calculaImc(peso, altura);
            }else if(resposta.equalsIgnoreCase("n")){
                loop=false;
            }else{
                System.out.println("Entrada inválida.");
            }
        }
        entrada.close();
    }
    
}
