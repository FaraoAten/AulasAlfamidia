package model;

public class Programador extends Empregado{
    
    private final double BONIFICACAO = 1.05;

    public Programador() {
        super();
    }

    public Programador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double totalAReceber() {
        double valorTotal = getValorHora()*getTotalHoras()*BONIFICACAO;
        return valorTotal;
    }    
}
