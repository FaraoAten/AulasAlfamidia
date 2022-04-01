package aulagravada4e5e6semana3;

import model.Objetos;
import model.ObjetosTriangulares;

public class AulaGravada4e5e6Semana3 {

    public static void main(String[] args) {
        Objetos[] arrayObjetos = {new Objetos(10,20), new Objetos(30,40), new Objetos(50,60), new Objetos(70,80)};
    
        for(Objetos elemento:arrayObjetos){
            elemento.exibe();
        }
        
        System.out.println("-----------------------");
        
        ObjetosTriangulares[] arrayObjetosTriangulares = {new ObjetosTriangulares(10,20,100), new ObjetosTriangulares(30,40,101), new ObjetosTriangulares(50,60,102), new ObjetosTriangulares(70,80,103)};
    
        for(ObjetosTriangulares elemento:arrayObjetosTriangulares){
            elemento.exibe();
        }
        
        System.out.println("-----------------------");
        
        Objetos[] arrayObjetosMisto = {new ObjetosTriangulares(10,20,100), new Objetos(30,40), new ObjetosTriangulares(50,60,102), new Objetos(70,80)};
    
        for(Objetos elemento:arrayObjetosMisto){
            elemento.exibe();
        }
    }
    
}
