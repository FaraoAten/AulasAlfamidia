package model;

import excecoes.NumeroMenorQueZeroException;

public class Calculadora {
    public void somar(int v1, int v2) throws NumeroMenorQueZeroException{
        if(v1 < 0||v2 < 0){
            throw new NumeroMenorQueZeroException("Número menor que zero.");
        }else{
            System.out.println(v1+v2);
        }
    }
}
