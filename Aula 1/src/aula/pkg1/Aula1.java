package aula.pkg1;

import java.math.BigDecimal;
import java.time.Clock;
import java.util.Scanner;

// botão direito>format identa o código.
public class Aula1 {
    public static void main(String[] args) {
        //System.out.println("Olá mundo!");
        
        //Números sem vírgula
        /* int x = 10;
        System.out.println(x); */
        
        //Números com vírgula
        /* double x = 10.0;
        System.out.println(x); */
        
        //Textos
        /* String x = "Aten";
        System.out.println(x); */
        
        //Array model 1
        /* int[] x = {1,2};
        System.out.println("["+x[0]+", "+x[1]+"]"); */
        
        //Array model 2
        /* int[] x = new int[2];
        x[0] = 0;
        x[1] = 1;
        System.out.println("["+x[0]+", "+x[1]+"]"); */
        
        //if else model 1
        /* int x = 10;
        
        if(x<10){
            System.out.println("É menor que 10.");
        }else{
            System.out.println("É maior ou igual à 10.");
        } */
        
        //if else model 2
        /* int x = 10;
        
        if(x<=10){
            System.out.println("É menor ou igual à 10.");
        }else{
            System.out.println("É maior que 10.");
        } */
        
        //if else model 3 (para comparar tipos primitivos se usa ==, diferença é !==)
        /* int x = 10;
        int y = 10;
        if(x==y){
            System.out.println("É igual.");
        }else{
            System.out.println("É diferente.");
        } */
        
        //if else model 4 (para comparar objetos se usa .equals, para difença se põe um ! antes da parada toda)
        /* BigDecimal x = new BigDecimal(10);
        BigDecimal y = new BigDecimal(10);
        
        if(x.equals(y)){
            System.out.println("É igual.");
        }else{
            System.out.println("É diferente.");
        } */
        
        //if else encadeado
        /* double peso = 15.5;
        
        if(peso<20){
            System.out.println("Magro");
        }else if(peso>200){
            System.out.println("Obeso");
        }else{
            System.out.println("Normal");
        } */
        
        //input
        /* Scanner t = new Scanner(System.in);
        
        System.out.println("Por favor digite um número: ");
        int entrada = t.nextInt();
        System.out.println("\nO número é: "+entrada+".");
        
        System.out.println("\nPor favor digite dois números: ");
        int n1 = t.nextInt();
        int n2 = t.nextInt();
        System.out.println("\nA soma é: "+(n1+n2)+"."); //Se não por a soma entre parênteses, enquanto houver uma String concatenada, ele não vai somar e sim transformar tudo em String.
       
        
        System.out.println("Digite sua idade: ");
        int idade = t.nextInt();
        
        if(idade<18){
            System.out.println("\nVocê é menor de idade.");
        }else{
            System.out.println("\nVocê é maior de idade.");
        }

        
         System.out.println("Digite seu nome: ");
         String nome = t.next(); //next() pega só até o próximo espaço, se quiser a linha completa tem de usar nextLine()
         
         if(nome.length()<5){
             System.out.println("\nSeu nome é curto.");
         }else if(nome.length()>=5 && nome.length()<=8){
             System.out.println("\nSeu nome tem um tamanho mediano.");
         }else{
             System.out.println("\nSeu nome é longo.");
         }
         
        t.close(); //encerrar o scanner, sempre fica no fim do programa  */
        
        //Switch case
        /* int x = 10;
        
        switch(x){
            case 9:
                System.out.println("É nove.");
                break;
            case 10:
                System.out.println("É dez.");
                break;
            default:
                System.out.println("Deu ruim.");
        } */
        
        //while
        /* boolean continua = true;
        Scanner t = new Scanner(System.in);
        while(continua){
            System.out.println("Deseja continuar? Y/N");
            String entrada = t.next();
            if(entrada.equalsIgnoreCase("n")){
                continua = false;
            }else if(!(entrada.equalsIgnoreCase("y")) && !(entrada.equalsIgnoreCase("n"))){
                System.out.println("Entrada inválida, tente novamente.\n");
            } 
        }
        t.close(); */
        
        //for
        /* int[] x = {12, 20, 28, 36, 44};
        
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        } */
        
        //do while
        /* int cont = 1;
        boolean continua = false;
        Scanner t = new Scanner(System.in);
        
        do{
            System.out.println("Repetiu "+cont+" vezes.");
            cont++;
            System.out.println("\nDeseja continuar?");
            continua = t.nextBoolean();
        }while (continua); */  
        
        //for each
        /* String[] nomes = {"Aten", "Deivid", "Taina", "Rafael"};
        int cont = 0;
        
        for (String nome:nomes){
            System.out.println(cont+" "+nome);
            cont++;
        } */
        
        //exercícios
        /* Scanner t = new Scanner(System.in);
        int v1 = t.nextInt();
        int v2 = t.nextInt();
        
        if(v1>v2){
            System.out.println(v1);
        }else if(v1<v2){
            System.out.println(v2);
        }else{
            System.out.println("Empate");
        } */
        
        /* System.out.println("Quantas maçãs foram compradas?");
        int m = t.nextInt();
        if(m<12){
            System.out.println("O valor total da compra é R$ "+(m*0.3));
        }else{
            System.out.println("O valor total da compra é R$ "+(m*0.25));
        } */
        
        /* System.out.println("Digite seu salário: ");
        double s = t.nextDouble();
        if(s<1100){
            System.out.println("Salário líquido: R$ "+((s*94)/100));
        }else if(s<=2500){
            System.out.println("Salário líquido: R$ "+((s*92)/100));
        }else if(s<=4800){
            System.out.println("Salário líquido: R$ "+((s*90)/100));
        }else{
            System.out.println("Salário líquido: R$ "+((s*85)/100));
        }
        
        boolean rep = true;
        while(rep){
            System.out.println("Digite o código do aluno:");
            int cod = t.nextInt();
            switch (cod){
                case 0:
                    rep=false;
                    break;
                default:
                    System.out.println("Digite as 3 notas do aluno:");
                    double n1 = t.nextDouble();
                    double n2 = t.nextDouble();
                    double n3 = t.nextDouble();
                    System.out.println("A média do aluno de código "+cod+" é "+ ((n1+n2+n3)/3));
            }
        }
        
        double[] val = new double[10];
        
        for(int i=0;i<10;i++){
            System.out.println("Digite um número: ");
            val[i] = t.nextDouble();
        }
        double maior=val[0], menor=val[0];
        for(int i=1;i<10;i++){
            if(val[i]>maior){
                maior = val[i];
            }
            if(val[i]<menor){
                menor = val[i];
            }
        }
        System.out.println("O maior valor é: "+ maior);
        System.out.println("O menor valor é:" + menor);
        t.close(); */
    }
    
}
