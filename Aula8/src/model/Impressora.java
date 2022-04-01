package model;

public class Impressora<T> { //classes e métodos também podem ser genéricos, porém para os métodos serem genéricos a classe também deve ser, Generics também podem estender classes e interfaces
    
    public T mostrar(T t){ //método genérico seu tipo é definido na hora da instancia do objeto Impressora que chama ele, métodos genéricos não podem ser estáticos.
        return t;
    }
}
