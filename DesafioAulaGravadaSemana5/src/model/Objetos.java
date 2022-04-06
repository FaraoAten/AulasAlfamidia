package model;

public class Objetos {
    protected int valor1, valor2;

    public Objetos() {
    }

    public Objetos(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public void exibe(){
        System.out.println(this);
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "(" + valor1 + ", " + valor2 + ')';
    }   
}