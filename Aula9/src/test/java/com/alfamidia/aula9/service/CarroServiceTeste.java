package com.alfamidia.aula9.service;

import com.alfamidia.aula9.model.Carro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarroServiceTeste {
    //Testes Unitários
    //Para realizá-los vamos utilizar o jUnit, um framework que da suporte a criação de testes automatizados em Java.
    //Os testes unitários se encarregam de testar minha camada de serviços antes ir para produção. Com eles é possível automatizar os testes e testar diversas condições do código,
    
    @Test //permite rodar o teste.
    @DisplayName("Se o valor for maior que duzentos mil, retorna true")
    public void deveriaRetornarVerdadeiroQuandoMaiorQueDuzentosMil(){
        Carro carro = new Carro();
        carro.setValor(26000000.00);
        CarroService service = new CarroService();
        Assertions.assertTrue(service.eMaiorQueDuzentosMil(carro));
    }
    
    @Test
    @DisplayName("Se o valor for menor ou igual a 200 mil, retorna false")
    public void deveriaRetornarFalsoQuandoValorMenorOuIgualDuzentosMil(){
        Carro carro = new Carro();
        carro.setValor(20.00);
        CarroService service = new CarroService();
        Assertions.assertTrue(service.eMaiorQueDuzentosMil(carro));
    }
}
