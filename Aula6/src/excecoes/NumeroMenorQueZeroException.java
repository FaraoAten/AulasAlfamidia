package excecoes;
//Padrão sempre termimar com "Exception"
public class NumeroMenorQueZeroException extends Exception{ //podemos criar nossas próprias exceções

    public NumeroMenorQueZeroException(String message) {
        super(message);
    }
    
}
