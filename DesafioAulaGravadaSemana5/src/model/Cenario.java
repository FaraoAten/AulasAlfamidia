package model;

import java.util.ArrayList;

public class Cenario {
    private ArrayList<ArrayList<Integer>> mapa;
    private ArrayList<String> desenhos;
    private ArrayList<Pecas> inimigos;
    private int contInimigos, contTiros;

    public Cenario() {
        this.contInimigos = 5;
        this.contTiros = 25;
        this.mapa = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            mapa.add(new ArrayList<>());
            for(int j = 0; j < 10; j++){
                mapa.get(i).add(0);
            }
        }
        desenhos = new ArrayList<>();
        desenhos.add(".");
        desenhos.add("X");
        desenhos.add("*");
        inimigos = new ArrayList<>();
        for(int i=0;i<this.contInimigos;i++){
            inimigos.add(new Pecas());
        }
    }
    
    public void desenhaLinha(ArrayList<Integer> linha){
        String strLinha = "";
        
        for(int celula:linha){
            strLinha+= desenhos.get(celula)+" ";
        }
        
        System.out.println(strLinha);
    }
    
    public void desenhaCenario(){
        for(ArrayList<Integer> linha:this.mapa){
            this.desenhaLinha(linha);
        }
        System.out.println("Inimigos Restantes: "+contInimigos);
        System.out.println("Tiros Restantes: "+contTiros+"\n");
    }
    
    public boolean disparo(int x, int y){
        contTiros--;
        double menor = 100;
        for(Pecas inimigo:inimigos){
            if(inimigo.isVivo()){
                double distanciaInimigo = inimigo.calculaDistancia(x, y);
                if(distanciaInimigo==0.0){
                    contInimigos--;
                }
                if(distanciaInimigo < menor){
                    menor = distanciaInimigo;
                }
            }
        }
        System.out.println("==================================================");
        System.out.println("Distancia do inimigo mais próximo: "+menor);
        System.out.println("==================================================");
        if(menor == 0.0){
            mapa.get(y).set(x, 2);
        }else{
            mapa.get(y).set(x, 1);
        }
        
        return (contTiros > 0 && contInimigos > 0);
    }
}
