package model;

public class ObjetosTriangulares extends Objetos{
    private int valor3;

    public ObjetosTriangulares() {
        super();
    }

    public ObjetosTriangulares(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    
    @Override
    public void exibe() {
        System.out.println(this);
    } 

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    @Override
    public String toString() {
        return "(" + valor1 + ", " + valor2 + ", " + valor3 + ')';
    }
}