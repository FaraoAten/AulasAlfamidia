package aula5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import model.Analista;
import model.Coordenador;
import model.Funcionario;

public class Aula5 {
    public static void main(String[] args) {
        
//        List lista = new ArrayList<String>(); // ArrayList mais usado, aqui também tem um exremplo de polimorfismo, onde se define a variável/obj com um tipo e intância com um outro que herde/implemente o primeiro, assim tendo o tipo do primeiro e o funcionamento do segundo.
//        lista.add("Mesa");
//        lista.add("Cadeira");
//        lista.add("Lustre");
//        
//        LinkedList lista2 = new LinkedList<String>();
//        lista2.add("Mesa");
//        lista2.add("Cadeira");
//        lista2.add("Lustre");
//
//        
//        System.out.println(lista.get(1)); //com .get(i) acessamos uma posição da lista
//        System.out.println(lista2.get(1));
//        
//        System.out.println(lista2.getFirst());//Só para LinkedList, retorna o primeiro elemento
//        System.out.println(lista2.getLast());//Só para LinkedList, retorna o último elemento
//        
//        System.out.println(lista.size()); //.size diz o tamanho da lista
//        System.out.println(lista2.size());
//        
//        System.out.println(lista.isEmpty()); //retorna true ou false dependendo se a lista está vazia ou não
//        System.out.println(lista2.isEmpty());
//        
//        System.out.println(lista.contains("Mesa")); //retorna true ou false dependendo se a lista contem o que foi passado ou não
//        System.out.println(lista2.contains("Mesa"));
//        
//        lista.remove(2); //remove o que estiver na posição 2
//        lista2.remove("Lustre");//remove a primeira aparição do obj passado, ambos funcionam para os 2 tipos de listas.
//        System.out.println(lista); 
//        System.out.println(lista2);
//        
//        HashSet lista3 = new HashSet<String>(); //Se um item repetido é adicionado ele remove a primeira cópia.
//        lista3.add("Mesa");
//        lista3.add("Cadeira");
//        lista3.add("Mesa");
//        
//        System.out.println(lista3);//Não tem o método get
//        System.out.println(lista3.size());//Tem o método size
//        System.out.println(lista2.isEmpty());//Tem o método isEmpty
//        System.out.println(lista2.contains("Mesa"));//Tem o método contains
//        lista3.remove("Mesa");//Tem apenas a versã passando objs do método remove
//        System.out.println(lista3);
        
        //transformado em classe abstrata para exemplos
       /*Funcionario funcionario = new Funcionario(221512155, "Jack", "jack@hotmail.com");
       funcionario.setNome("Jackeline");
       System.out.println(funcionario);
       funcionario.generaliza();
       System.out.println(funcionario);*/
        
        Analista analista = new Analista(661566515, "Aten", "atenfernandes@gmail.com");
        analista.setNome("Carlos");
        analista.setEquipamento("PC");//Não é possível para funcionário, pois é um atributo apenas da classe filha
        System.out.println(analista);      
        analista.generaliza(1);
        System.out.println(analista);
        
        Funcionario coordenador = new Coordenador("TI", 21212151, "Jhon", "jhon@gmail.com");//outro exemplo de polimorfismo
    }
    
}
