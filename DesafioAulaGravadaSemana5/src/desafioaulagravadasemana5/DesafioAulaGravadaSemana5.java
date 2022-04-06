package desafioaulagravadasemana5;

import java.util.ArrayList;
import java.util.Scanner;
import model.Objetos;
import model.ObjetosTriangulares;

public class DesafioAulaGravadaSemana5 {
//        public static void calculoImc(double peso, double altura){
//        ArrayList<Double> pesosImc = new ArrayList<>();
//        pesosImc.add(18.5);
//        pesosImc.add(24.9);
//        pesosImc.add(29.9);
//        pesosImc.add(39.9);
//        pesosImc.add(9000000.0);
//        
//        ArrayList<String> classificacoes = new ArrayList<>();
//        classificacoes.add("Magreza");
//        classificacoes.add("Normal");
//        classificacoes.add("Sobrepeso");
//        classificacoes.add("Obesidade");
//        classificacoes.add("Obesidade Grave");
//        
//        double imc = peso/(altura*altura);
//        
//        int i=0;
//        while(imc>pesosImc.get(i)){
//            i++;
//        }
//        System.out.println("O seu IMC é: "+imc);
//        System.out.println("A classificação é: "+classificacoes.get(i));
//        
//    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite seu peso:");
//        double peso = entrada.nextDouble();
//        
//        System.out.println("Digite sua altura:");
//        double altura = entrada.nextDouble();
//        
//        calculoImc(peso, altura);
        
//        System.out.println("Entre com um número de posições:");
//        int posicoes = entrada.nextInt();
//        
//        ArrayList<Integer> dados = new ArrayList<>();
//        
//        for(int i=0;i<posicoes;i++){
//            System.out.println("\nEntre com o próximo número:");
//            dados.add(entrada.nextInt());
//        }
//        
//        System.out.println("\nEntre com a operação:");
//        System.out.println("1- Listar em ordem.");
//        System.out.println("2- Listar invertido.");
//        System.out.println("3- Exibir números menores que 5.");
//        System.out.println("4- Exibir até o primeiro menor que 5.");
//        int operacao = entrada.nextInt();
//        System.out.println(" ");
//        switch(operacao){
//            case 1:
//                for(int dado:dados){
//                    System.out.println(dado);
//                }
//                break;
//            case 2:
//                for(int i=(dados.size()-1);i>-1;i--){
//                    System.out.println(dados.get(i));
//                }
//                break;
//            case 3:
//                for(int i=0;i<dados.size();i++){
//                    if(dados.get(i)>=5){
//                        continue;
//                    }
//                    System.out.println(dados.get(i));
//                }
//                break;
//            case 4:
//                for(int i=0;i<dados.size();i++){
//                    if(dados.get(i)>=5){
//                        break;
//                    }
//                    System.out.println(dados.get(i));
//                }
//                break;
//            default:
//                System.out.println("Operação inválida.");
//        }

//        ArrayList<Integer> arrayInteiros = new ArrayList<>();
//        arrayInteiros.add(10);
//        arrayInteiros.add(20);
//        arrayInteiros.add(30);
//        arrayInteiros.add(40);
//        arrayInteiros.add(50);
//        
//        
//        for(int i=0; i<arrayInteiros.size();i++){
//            System.out.println(arrayInteiros.get(i));
//        }
//        
//        System.out.println("------------------------");
//        
//        for(int inteiro:arrayInteiros){
//            System.out.println(inteiro);
//        }

//        ArrayList<Objetos> arrayObjetos = new ArrayList<>();
//        arrayObjetos.add(new Objetos(10,20));
//        arrayObjetos.add(new Objetos(30,40));
//        arrayObjetos.add(new Objetos(50,60));
//        arrayObjetos.add(new Objetos(70,80));
//        
//        for(Objetos elemento:arrayObjetos){
//            elemento.exibe();
//        }
//        
//        System.out.println("-----------------------");
//        
//        ArrayList<ObjetosTriangulares> arrayObjetosTriangulares = new ArrayList<>();
//        arrayObjetosTriangulares.add(new ObjetosTriangulares(10,20,100));
//        arrayObjetosTriangulares.add(new ObjetosTriangulares(30,40,101));
//        arrayObjetosTriangulares.add(new ObjetosTriangulares(50,60,102));
//        arrayObjetosTriangulares.add(new ObjetosTriangulares(70,80,103));
//        
//        for(ObjetosTriangulares elemento : arrayObjetosTriangulares){
//            elemento.exibe();
//        }
//        
//        System.out.println("-----------------------");
//        
//        ArrayList<Objetos> arrayObjetosMisto = new ArrayList<>();
//        arrayObjetosMisto.add(new ObjetosTriangulares(10,20,100));
//        arrayObjetosMisto.add(new Objetos(30,40));
//        arrayObjetosMisto.add(new ObjetosTriangulares(50,60,102));
//        arrayObjetosMisto.add(new Objetos(70,80));
//        
//        for(Objetos elemento : arrayObjetosMisto){
//            elemento.exibe();
//        }

        Jogo.main(args);
        
        entrada.close();
    }
    
}
