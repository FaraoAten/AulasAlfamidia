package exerciciosaula5;

import java.util.ArrayList;
import model.*;

public class ExerciciosAula5 {

    public static void main(String[] args) {
//        ArrayList listaFuncionarios = new ArrayList<String>();
//        
//        Funcionario funcionario1 = new Funcionario("Aten", "Desenvolvedor Backend", "Programador Junior");
//        Funcionario funcionario2 = new Funcionario("Christian", "Desenvolvedor Backend", "Programador Junior");
//        Funcionario funcionario3 = new Funcionario("Lucas", "Desenvolvedor Frontend", "Programador Junior");
//        Funcionario funcionario4 = new Funcionario("José", "Desenvolvedor Frontend", "Programador Junior");
//        Funcionario funcionario5 = new Funcionario("Alfredo", "Desenvolvedor Full Stack", "Programador Sênior");
//        Funcionario funcionario6 = new Funcionario("Paulo", "Desenvolvedor Full Stack", "Programador Sênior");
//        Funcionario funcionario7 = new Funcionario("Sebastião", "Desenvolvedor Backend", "Programador Sênior");
//        Funcionario funcionario8 = new Funcionario("Fabrício", "Desenvolvedor Backend", "Programador Sênior");
//        Funcionario funcionario9 = new Funcionario("Sérgio", "Desenvolvedor Frontend", "Programador Sênior");
//        Funcionario funcionario10 = new Funcionario("Roberto", "Desenvolvedor Frontend", "Programador Sênior");
//        
//        listaFuncionarios.add(funcionario1);
//        listaFuncionarios.add(funcionario2);
//        listaFuncionarios.add(funcionario3);
//        listaFuncionarios.add(funcionario4);
//        listaFuncionarios.add(funcionario5);
//        listaFuncionarios.add(funcionario6);
//        listaFuncionarios.add(funcionario7);
//        listaFuncionarios.add(funcionario8);
//        listaFuncionarios.add(funcionario9);
//        listaFuncionarios.add(funcionario10);
//        
//        listaFuncionarios.forEach(f -> System.out.println(f));
        
//        Humano humano = new Humano();
//        Cachorro cachorro = new Cachorro();
//        Gato gato = new Gato();
//        
//        humano.emitirSom();
//        cachorro.emitirSom();
//        gato.emitirSom();
        
        Programador programador = new Programador("Aten", 20.00, 184);
        Contador contador = new Contador("Robson", 12.50, 120);
        Administrador administrador = new Administrador("João", 21.30, 200.5);
        
        System.out.println(programador.totalAReceber());
        System.out.println(contador.totalAReceber());
        System.out.println(administrador.totalAReceber());
    }
    
}
