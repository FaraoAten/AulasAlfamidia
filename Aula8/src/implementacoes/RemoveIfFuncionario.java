package implementacoes;

import java.util.function.Predicate;
import model.Funcionario;

public class RemoveIfFuncionario implements Predicate<Funcionario>{ //Forma para usar o Predicate

    @Override
    public boolean test(Funcionario funcionario) {
         return funcionario.getSalario() > 1500.00;
    }
    
}
