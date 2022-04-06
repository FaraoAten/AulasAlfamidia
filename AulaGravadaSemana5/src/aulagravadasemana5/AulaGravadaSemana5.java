package aulagravadasemana5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import model.Objetos;
import model.ObjetosSimples;
import model.ObjetosTriangulares;

//enum Estacoes{ //Enumerações são sempre em maiúsculo por completo
//    VERAO, OUTONO, INVERNO, PRIMAVERA 
//}

public class AulaGravadaSemana5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Array - no Java ele tem um problema que é o seu tamanho ser fixo, o que acaba gerando problemas com a extrapolação do tamanho ou com o consumo excessivo de memória.

//        int[] lista = new int[5];
//        int i = 0;
//
//        while (true) {
//            int valor = entrada.nextInt();
//            if (valor < 0) {
//                break;
//            }
//            lista[i++] = valor;
//        }
//
//        for (int j = 0; j < i; j++) {
//            System.out.println(lista[j]);
//        }

        //LinkedList(grava a posição do elemento e um ponteiro que diz para o programa onde na memória o seguinte está) e ArrayList(toda vez que tamanho máximo é excedido ele copia todos os dados em um array maior)
        //Em caso de dúvida usar o ArrayList, pois ele tem menos chances de apresentar um problema de performance.
        //Mas em tese ambos fazem o mesmo, criam um array "infinito", mudando apenas a performance dependendo da aplicação.
        
//        ArrayList<Integer> lista = new ArrayList<>(); //Para os ArrayLists e LinkedLists o tipo do que vai ser armazenado nele deve ser especificado dentro do <> e não pode ser tipo primitivo.
//       
//        while (true) {
//            int valor = entrada.nextInt();
//            if (valor < 0) {
//                break;
//            }
//            lista.add(valor);
//        }
//
//        for (int j = 0; j < lista.size(); j++) {
//            System.out.println(lista.get(j));
//        }
        
//        LinkedList<Integer> lista = new LinkedList<>();
//        
//        while (true) {
//            int valor = entrada.nextInt();
//            if (valor < 0) {
//                break;
//            }
//            lista.add(valor);
//        }
//
//        for (int j = 0; j < lista.size(); j++) {
//            System.out.println(lista.get(j));
//        }
        
        //É possível também criar ArrayLists e LinkedLists usando um casting da classe da qual eles herdam "List"
        
        //Principais métodos do ArrayList
        
//        ArrayList<String> lista = new ArrayList<>();
//        
//        lista.add("cachorro"); //add é o método usado para inserir um valor na lista
//        lista.add("gato");
//        lista.add("coelho");
//        System.out.println(lista);//isso excuta o toString do ArrayList e imprime todos os elementos da lista em uma linha separados por vírgula
//        
//        lista.add(1,"lobo");//ao construir o add dessa maneira, estamos inserindo o valor desejado no índice especificado pelo número
//        System.out.println(lista);//mas isso não exclui o elemento que previamente ocupava aquela posição, apenas coloca-o para posição seguinte
//        
//        ArrayList<String> lista2 = new ArrayList<>();
//        lista2.add("boi");
//        lista2.add("bode");
//        lista.addAll(lista2);//o addAll permite inserir uma lista dentro de outra contanto que sejam do mesmo tipo, também é possível definir um indíce de onde vai se iniciar a incersão assim como no add
//        System.out.println(lista);
//        
//        System.out.println(lista.get(5));//o get(índice) pega o elemento presente no índice especificado
//        
//        lista.set(5, "bode do mal");// o set permite fazermos a substituição do elemento presente no índice especificado pelo valor que passamos no método
//        System.out.println(lista);
//        
//        System.out.println("O gato é o elemento "+lista.indexOf("gato"));//o indexOf(valor) retorna a posição onde aquele valor se econtra na lista, retornando -1 caso aquele valor não exita na lista
//        
//        if(lista.contains("gato")) System.out.println("Tem um gato na lista"); //O contains retorna True caso o valor passado estaja presente na lista e false caso não
//        
//        Collections.sort(lista);//O Collections.sort ordena uma lista
//        System.out.println(lista);
//        
//        lista.remove(0);//remove(índice) remove o elemento naquela posição
//        System.out.println(lista);
        
        //Enumerações (enum)
        //Usado para definir um conjunto fixo de informações, por exemplo, dias da semana, meses...
        //Melhora a legibilidade do código
        
//        Estacoes estacaoAtual = Estacoes.PRIMAVERA;
//        
//        switch(estacaoAtual){
//            case VERAO:
//                System.out.println("É verão.");
//                break;
//            case OUTONO:
//                System.out.println("É outono.");
//                break;
//            case INVERNO:
//                System.out.println("É inverno.");
//                break;
//            case PRIMAVERA:
//                System.out.println("É primavera.");
//                break;
//        }
//        
//        for(Estacoes estacao : Estacoes.values()){//o método values retorna todos os valores presentes naquele enum
//            System.out.println(estacao);
//        }
//        
//        String estacaoString = estacaoAtual.toString();//o toString() transforma o enum em uma String.
//        System.out.println(estacaoString);
//        
//        System.out.println(estacaoAtual.ordinal());//ordinal retorna a posição onde aquela enumeração está presente no enum.
        
        //classes abstratas
        //É uma classe que não pode ser instânciada, ela criada basicamente para ser herdada e padronizar certos métodos que as classes filhas devem ter, além disso servem como casting genérico para assim podermos criar, por exemplo, listas que mesclem objetos de todas as suas filhas.
        
        ArrayList<ObjetosSimples> arrayObjetos = new ArrayList<>();
        arrayObjetos.add(new ObjetosSimples(10,20));
        arrayObjetos.add(new ObjetosSimples(30,40));
        arrayObjetos.add(new ObjetosSimples(50,60));
        arrayObjetos.add(new ObjetosSimples(70,80));
        
        for(Objetos elemento:arrayObjetos){
            elemento.exibe();
        }
        
        System.out.println("-----------------------");
        
        ArrayList<ObjetosTriangulares> arrayObjetosTriangulares = new ArrayList<>();
        arrayObjetosTriangulares.add(new ObjetosTriangulares(10,20,100));
        arrayObjetosTriangulares.add(new ObjetosTriangulares(30,40,101));
        arrayObjetosTriangulares.add(new ObjetosTriangulares(50,60,102));
        arrayObjetosTriangulares.add(new ObjetosTriangulares(70,80,103));
        
        for(ObjetosTriangulares elemento : arrayObjetosTriangulares){
            elemento.exibe();
        }
        
        System.out.println("-----------------------");
        
        ArrayList<Objetos> arrayObjetosMisto = new ArrayList<>();
        arrayObjetosMisto.add(new ObjetosTriangulares(10,20,100));
        arrayObjetosMisto.add(new ObjetosSimples(30,40));
        arrayObjetosMisto.add(new ObjetosTriangulares(50,60,102));
        arrayObjetosMisto.add(new ObjetosSimples(70,80));
        
        for(Objetos elemento : arrayObjetosMisto){
            elemento.exibe();
        }
        
        entrada.close();
    }
}
