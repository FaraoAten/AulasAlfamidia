package model;

public class Jogador {
    private String nome;
    private int gols, assistencias;

    public Jogador() {
    }
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setGols(int gols){
        if(gols>0){
            this.gols = gols;
        }
    }
    
    public void setAssistencias(int assistencias){
        if(assistencias>0){
            this.assistencias = assistencias;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getGols(){
        return this.gols;
    }
    
    public int getAssistencias(){
        return this.assistencias;
    }
}
