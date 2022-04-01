package model;

public class Contador {
    
    private static int valor = 0;
    
    //final transforma em constante, exemplo PI. Sempre escritas só com maiúsculas.
    
    public static void incrementa(){ //static faz com que não se tenha que estanciar um obj para utilizar esse método, além disso tudo que é static é compartilhado entre os objs (por isso chamado de valor de classe)
        valor++;
    }
    
    public int getValor(){
        return Contador.valor;
    }
}
