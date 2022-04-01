package model;
//Uma interface pode extender outra interface.
public interface Forma { //não é possível extender 2 classes/classes abstratas, mas é posssível implementar infinitas interfaces.
    
    public double area();
    
    public default void qualquerCoisa(){ //default é um jeito de se por corpo nos métodos de uma interface
        System.out.println("-----------------------");
        System.out.println("Funcionou");
    }
}
