package implementacoes;

import java.util.function.Consumer;
import model.Funcionario;

public class ForEachFuncionario implements Consumer<Funcionario> {

    @Override
    public void accept(Funcionario funcionario) {
        System.out.println(funcionario.getNome()+", "+funcionario.getSalario());
    }
    
}
