package model;

public class Administrador extends Empregado{
    
    private final double BONIFICACAO = 1.06;

    public Administrador() {
        super();
    }

    public Administrador(String nome, double valorHora, double totalHoras) {
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double totalAReceber() {
        double valorTotal = getValorHora()*getTotalHoras()*BONIFICACAO;
        return valorTotal;
    }     
}
