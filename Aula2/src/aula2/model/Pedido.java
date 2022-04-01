package aula2.model;

public class Pedido {
    public String cliente;
    public double valor;
    public String[] itens = new String[5];
    
    public Pedido (String cliente){
        this.cliente = cliente;        
    }
    
    public void recebeItemValor(String item, double valor){
        this.valor += valor;
        for(int i=0;i<this.itens.length;i++){
            if(this.itens[i] == null){
                this.itens[i] = item;
                break; //para o laço de repetição e impede que todos os espaços do Array sejam preenchidos com um único item.
            }
        }
    }
    
//    public String mensagem(){
//        String texto = "O cliente " + cliente + " fez uma compra de " + valor + " e os itens eram: " + itens[0] + ", " + itens[1] + ", " + itens[2] + ", " + itens[3] + ", " + itens[4];
//        return texto;
//    }

    public String retornaItens(){
        String itensLista = "";
        for(String item:itens){
            itensLista += item + ", ";
        }
        itensLista = itensLista.substring(0, itensLista.length() - 2);
        return itensLista;
    }
    
    @Override
    public String toString() {
        return "O(A) cliente " + cliente + " comprou " + retornaItens() + " e o valor foi R$" + valor;
    }
    
    
}
