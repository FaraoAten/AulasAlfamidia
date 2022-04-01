package com.alfamidia.aula9.service;

import com.alfamidia.aula9.model.Carro;

public class CarroService {
    
//    public void mudaStatusParaAlugado(Carro carro){
//        carro.setStatus("Alugado");
//        System.out.println(carro.getStatus());
//    }
    
    public boolean eMaiorQueDuzentosMil(Carro carro){
        return carro.getValor() > 200000.00;
    }
}
