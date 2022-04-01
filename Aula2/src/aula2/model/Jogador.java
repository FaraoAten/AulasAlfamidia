package aula2.model;

public class Jogador {
    public String nome;
    public int gols,assistencias;
    
    public Jogador(String nome){
        this.nome = nome;
        this.gols = 0;
        this.assistencias = 0;
    }
    
    public void addGols(int golNum){
        this.gols += golNum;
    }
    
    public void addAssist(int assitNum){
        this.assistencias += assitNum;
    }
    
    public String mostrarGols(){
        String textoGols = "O(A) jogador(a) "+nome+" marcou "+gols+" gols.";
        return textoGols;
    }
    
    public String mostrarAssist(){
        String textoAssist = "O(A) jogador(a) "+nome+" marcou "+assistencias+" assistências.";
        return textoAssist;
    }
}
