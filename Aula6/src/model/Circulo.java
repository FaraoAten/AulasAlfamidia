package model;

public class Circulo implements Forma{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return Math.PI*(this.getRaio()*this.getRaio());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
