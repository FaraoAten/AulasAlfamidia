package aula2.model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno {
    public String nome;
    public double[] notas = new double[3];
    
    public Aluno(String nome, double n1, double n2, double n3){
        this.nome = nome;
        if ((n1+n2+n3)>100){
            System.out.println("Atenção montante maior que 100, reinsira as notas.");
            insereNotas();
        }else{
            this.notas[0] = n1;
            this.notas[1] = n2;
            this.notas[2] = n3;
        }
    }
    
    public String retornaResultado(){
        
        double maior = 0, menor = 100, soma = 0;
        for(int i=0;i<notas.length;i++){
            soma += notas[i];
            if(notas[i]>maior){
                maior=notas[i];
            }
            if(notas[i]<menor){
                menor=notas[i];
            }
        }
        double media = soma/3;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("##.##");
        String resultado = "O(A) aluno(a) "+nome+" teve média "+df.format(media)+", sua maior nota foi "+maior+" e sua menor nota foi "+menor+".";
        return resultado;
    }
    
    private void insereNotas(){
        double n1,n2,n3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nota 1:");
        n1=entrada.nextDouble();
        System.out.println("Nota 2:");
        n2=entrada.nextDouble();
        System.out.println("Nota 3:");
        n3=entrada.nextDouble();
        
        if ((n1+n2+n3)>100){
            System.out.println("Atenção montante maior que 100, reinsira as notas.");
            insereNotas();
        }else{
            this.notas[0] = n1;
            this.notas[1] = n2;
            this.notas[2] = n3;
        }
         entrada.close();
    }
}
