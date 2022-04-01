package com.alfamidia.aula9;

import com.alfamidia.aula9.model.Carro;
import com.alfamidia.aula9.service.CarroService;

public class Main {
    //Maven e Testes Unitários
    //Maven - Gerenciador de pacotes para tratar depências do projeto. Muito usado em Web applications, principalmente c/ SpringBoot.
    //Sempre que adicionarmos dependências no Maven, temos que clicar com o botão direito sobre o projeto e ir em build com dependências.
    
    public static void main(String[] args){
        Carro carro = new Carro();
        CarroService service = new CarroService();
        
        carro.setValor(250000.00);
        
        System.out.println("\n###############################################\n");
//        service.mudaStatusParaAlugado(carro);
        System.out.println(service.eMaiorQueDuzentosMil(carro));
        System.out.println("\n###############################################\n");
    }
}
