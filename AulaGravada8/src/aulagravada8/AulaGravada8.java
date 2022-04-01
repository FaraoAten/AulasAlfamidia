package aulagravada8;

import java.util.Scanner;

public class AulaGravada8 {
    public static boolean f(int x,int y) {
        if (x==0) return true;
        if (y==1) return false;
        return (x>y);
      }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com um número de posições:");
        int posicoes = entrada.nextInt();
        
        int[] dados = new int[posicoes];
        
        for(int i=0;i<dados.length;i++){
            System.out.println("\nEntre com o próximo número:");
            dados[i] = entrada.nextInt();
        }
        
        System.out.println("\nEntre com a operação:");
        System.out.println("1- Listar em ordem.");
        System.out.println("2- Listar invertido.");
        System.out.println("3- Exibir números menores que 5.");
        System.out.println("4- Exibir até o primeiro menor que 5.");
        int operacao = entrada.nextInt();
        System.out.println(" ");
        switch(operacao){
            case 1:
                for(int dado:dados){
                    System.out.println(dado);
                }
                break;
            case 2:
                for(int i=(dados.length-1);i>-1;i--){
                    System.out.println(dados[i]);
                }
                break;
            case 3:
                for(int i=0;i<dados.length;i++){
                    if(dados[i]>=5){
                        continue;
                    }
                    System.out.println(dados[i]);
                }
                break;
            case 4:
                for(int i=0;i<dados.length;i++){
                    if(dados[i]>=5){
                        break;
                    }
                    System.out.println(dados[i]);
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        entrada.close();
    } 
}
