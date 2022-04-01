package model;

import Enuns.Status;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pedido {
    private String[] itens = new String[10];
    private Status status;
    private double valorTotal;
    private int i=0;

    public Pedido() {
        this.status = Status.AGUARDANDO;
    }
    
    public void adicionaItem(String item, double valor){
        setItens(item);
        setValorTotal(valor);
    }
    
    public void mudaStatus(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o status do pedido? 1-Pronto, 2-Preparando, 3-Aguardando");
        int status = entrada.nextInt();
        switch (status){
            case 1:
                setStatus("PRONTO");
                break;
            case 2:
                setStatus("PREPARANDO");
                break;
            case 3:
                setStatus("AGUARDANDO");
                break;
            default:
                System.out.println("Status inválido, tente denovo.");
                mudaStatus();
        }
        entrada.close();
    }

    public String getItens() {
        String stringItens = "";
        for(int i=0; i<itens.length; i++){
            if(itens[i]!=null){
                stringItens += itens[i]+", ";
            }
        }
        return stringItens.substring(0, stringItens.length()-2);
    }

    public void setItens(String item) {
        if(i<getItens().length()){
            this.itens[i] = item;
            i++;
        }else{
            System.out.println("Pedido cheio.");
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal += valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "itens=" + getItens() + ", status=" + status + ", valorTotal= R$ " + valorTotal + '}';
    }
    
    
}
