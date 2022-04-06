package model;

public class ObjetosSimples extends Objetos{
    
    public ObjetosSimples() { 
    }

    public ObjetosSimples(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public void exibe() {
        System.out.println(this);
    }    
}
