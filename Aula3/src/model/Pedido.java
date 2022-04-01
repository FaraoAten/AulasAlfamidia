package model;

import enuns.Status;

public class Pedido {
    private String cliente;
    private Double valorTotal;
    private String[] itens = new String[10];
    private Status status;

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getItens() {
        String itensConcat = "";
        for(String item:itens){
            if(item!=null){
             itensConcat += item+", ";   
            }
        }
        return itensConcat.substring(0, itensConcat.length() -2);
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(Status.EM_ANDAMENTO.toString().equalsIgnoreCase(status)||Status.PRONTO.toString().equalsIgnoreCase(status)||Status.AGUARDANDO.toString().equalsIgnoreCase(status)){
            this.status = Status.valueOf(status.toUpperCase());
        }else{
            this.status = null;
        }
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", valorTotal=" + valorTotal + ", itens=" + getItens() + ", status=" + status + '}';
    }
    
       
}
