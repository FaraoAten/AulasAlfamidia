package model;

public class Humano extends Animal{

    public Humano() {
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Olá, tudo bem?");
    }
}
