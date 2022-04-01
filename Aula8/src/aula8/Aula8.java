package aula8;

import implementacoes.ForEachFuncionario;
import implementacoes.RemoveIfFuncionario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Funcionario;
import model.Impressora;

public class Aula8 {
    public static void main(String[] args) {
        //Generics existem para reduzir errosatravés de tipagem, Lists usam Generics "<E>" sendo esse "E" substituido pelo tipo desejado.
        //Muito usado em frameworks
        
//        Impressora<String> impressora1 = new Impressora(); //obj de classe genérica sendo instânciados
//        Impressora<Integer> impressora2 = new Impressora();
//        
//        System.out.println(impressora1.mostrar("Aten"));
//        System.out.println(impressora2.mostrar(2));

        //Interface Funcional (Expressões Lambdas/Arrow Function)
        //Interface com apena 1 método abstrato. Ex.: Predicate, Consumer e Function.
        
        List<Funcionario> lista = new ArrayList();
        lista.add(new Funcionario("Maria",1000.0));
        lista.add(new Funcionario("José",1000.0));
        lista.add(new Funcionario("Ana",1800.0));
        lista.add(new Funcionario("João",2000.0));
        
//        System.out.println(lista.size());
//        for(Funcionario func : lista){
//            System.out.println(func.getNome()+", "+func.getSalario());
//        }
//        
//        lista.removeIf(new RemoveIfFuncionario());//usa Predicate no filter. Retorna o tipo Boolean.
//        System.out.println("\n"+lista.size());
//        for(Funcionario func : lista){
//            System.out.println(func.getNome()+", "+func.getSalario());
//        }
//        
//        lista.removeIf(funcionario -> funcionario.getSalario() > 1500.00);//Mesma forma de resolver porém usando expressão lambda/Arrow Function
//                      //está funcionando como um forEach.
//        
//        System.out.println("\n"+lista.size());
//        for(Funcionario func : lista){
//            System.out.println(func.getNome()+", "+func.getSalario());
//        }

//        lista.forEach(new ForEachFuncionario());//usa Consumer no action. Não retorna nada, void.
//        lista.forEach(funcionario -> System.out.println(funcionario.getNome()+", "+funcionario.getSalario())); //usando Lambda.

//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        
//        Arrays.stream(array).forEach(i -> System.out.println(i));//classe Arrays tem diversas funções prontas para manipular arrays, stream é uma delas que por sua vez possui mais manipulações.
//        //uma das manipulações é o forEach para arrays usando Consumer. Não foi feito classe para esse exemplo para poupar tempo.
        
        
    }
    
}
