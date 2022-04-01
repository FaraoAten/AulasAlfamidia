package aula2;

import aula2.model.Aluno;
import aula2.model.Jogador;
import aula2.model.Pedido;

public class Aula2 {
    public static void main(String[] args) {
        
//        Pedido pedido01 = new Pedido("João");
//        
//        System.out.println(pedido01.toString());
//        
//        pedido01.recebeItemValor("Refri", 5);
//        pedido01.recebeItemValor("Batata frita", 7.5);
//        pedido01.recebeItemValor("Água com gás", 4.9);
//        pedido01.recebeItemValor("Xis", 12.7);
//        pedido01.recebeItemValor("Picolé", 6.8);
//        
//        
//        System.out.println(pedido01.toString());

//        Jogador jogador = new Jogador("Marcos");
//        
//        System.out.println(jogador.mostrarGols());
//        System.out.println(jogador.mostrarAssist());
//        
//        jogador.addGols(5);
//        jogador.addAssist(12);
//        
//        System.out.println(jogador.mostrarGols());
//        System.out.println(jogador.mostrarAssist());

        Aluno aluno = new Aluno("José", 90, 50.5, 80);
        
        System.out.println(aluno.retornaResultado());
    }
    
}
