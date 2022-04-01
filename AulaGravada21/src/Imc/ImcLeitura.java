package Imc;

import java.util.Scanner;

public class ImcLeitura extends Imc{
    Scanner entrada;

    public ImcLeitura() {
        super();
        entrada = new Scanner(System.in); // em POO estância o scanner no construtor
    }
    
    public double lerDouble(String texto){
        boolean continuarLeitura = true;
        double valor = 0;
        
        while(continuarLeitura){
            System.out.println(texto);
            try{ // try catch faz o tratamento de excessóes ao tentar excutar o que está no try e se der erro executar o que está no catch.
                valor = Double.parseDouble(entrada.nextLine());
                continuarLeitura = false;
            }catch(NumberFormatException e){
                System.out.println("Valor inválido, tente novamente.");
            }
        }
        return valor;
    }
    
    public void lerPeso(){
        setPeso(lerDouble("Digite seu peso:"));
    }
    
    public void lerAltura(){
        setAltura(lerDouble("Digite sua altura:"));
    }
}
