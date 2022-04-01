package model;

public class Contador extends Empregado{
    
    private final double BONIFICACAO = 1.03;

    public Contador() {
        super();
    }

    public Contador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double totalAReceber() {
        double valorTotal = getValorHora()*getTotalHoras()*BONIFICACAO;
        return valorTotal;
    }      
}
