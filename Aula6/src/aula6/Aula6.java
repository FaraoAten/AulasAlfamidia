package aula6;

import excecoes.NumeroMenorQueZeroException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.*;

public class Aula6 {
    public static void main(String[] args) throws ParseException {
        
//        Retangulo retangulo = new Retangulo(10, 5);
//        Circulo circulo = new Circulo(25);
//        
//        System.out.println(retangulo.area());
//        System.out.println(circulo.area());
//        
//        retangulo.qualquerCoisa();

        //Tratamento de exceções
        //Scanner sc = new Scanner(System.in);
        
//        try{
//            String[] arrayStrings = new String[3];
//            arrayStrings[0] = "Posição 0";
//            arrayStrings[1] = "Posição 1";
//            arrayStrings[2] = "Posição 2";
//            
//            System.out.println("Digite um número:");
//            int valor1 = sc.nextInt();
//            
//            System.out.println(arrayStrings[valor1]);
//        }catch(InputMismatchException entrada){//Toda exceção extende Exception, então colocando 'catch(Exception e)' vai pegar todas as exceções, mas para ter acesso a algumas funções, além de tratar melhor o erro, é necessário pegar as exceções específicas disparadas geradas. 
//            System.out.println("Valor inválido.");
//        }catch(ArrayIndexOutOfBoundsException array){//Pode ter mais de um catch para um mesmo try
//            System.out.println("Posição inexistente.");
//        }finally{
//            System.out.println("Sempre ocorrerá.");
//        }
        

//        Calculadora calc = new Calculadora();
//        
//        try{
//            calc.somar(1, 2);
//            calc.somar(-1, 2);
//        }catch(NumeroMenorQueZeroException e){
//            System.out.println(e.getMessage());
//        }
        //sc.close();
        
        Date agora = new Date(); //data de agora
        System.out.println(agora);
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");// cria uma máscara para receber datas
        Date date = format.parse("03/03/2022 18:00:15 ");//inserindo em um objeto Date
        System.out.println(date);
    }
}
