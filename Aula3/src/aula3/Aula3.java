package aula3;

import model.*;

public class Aula3 {
    public static void main(String[] args) {
//        Jogador jogador = new Jogador("Mário");
//        
//        jogador.setGols(-2);
//        jogador.setAssistencias(-2);
//        System.out.println(jogador.getGols()+" "+ jogador.getAssistencias());
//        
//        jogador.setGols(3);
//        jogador.setAssistencias(1);
//        System.out.println(jogador.getGols()+" "+ jogador.getAssistencias());

//        Pedido pedido = new Pedido("José");
//        
//        String[] itens = new String[10];
//        itens[0] = "Água";
//        itens[1] = "Xis";
//        
//        pedido.setItens(itens);
//        pedido.setValorTotal(16.00);
//        pedido.setStatus("fsdfsa");
//        System.out.println(pedido);

//        Contador contador = new Contador();
//        System.out.println(contador.getValor());
//        Contador contador2 = new Contador();
//        System.out.println(contador2.getValor());
//        
//        Contador.incrementa();
//        
//        System.out.println(contador.getValor());
//        System.out.println(contador2.getValor());

        Aluno aluno = new Aluno("Aten", "2115211653", "Sapucaia do Sul");
        Professor professor = new Professor("Marlon", "JAVA");
        
        aluno.setProfessor(professor);
        professor.setAluno(aluno);
        
        System.out.println(aluno);
        System.out.println(professor);
    }
    
}
