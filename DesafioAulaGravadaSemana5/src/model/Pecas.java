package model;

import java.util.Random;

public class Pecas {
    private int x, y;
    private boolean vivo;

    public Pecas() {
        Random aleatorio = new Random();
        this.x = aleatorio.nextInt(10);
        this.y = aleatorio.nextInt(10);
        this.vivo = true;
    }
    
    public double calculaDistancia(int x, int y){
        double distancia = Math.sqrt(Math.pow((this.getX() - x),2) + Math.pow((this.getY() - y),2));  
        if(distancia == 0.0){
            this.vivo = false;
        }
        return distancia;
    }   

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVivo() {
        return vivo;
    }
}
