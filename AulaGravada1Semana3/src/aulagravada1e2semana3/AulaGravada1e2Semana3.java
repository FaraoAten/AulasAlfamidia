package aulagravada1e2semana3;

import model.Objetos;

public class AulaGravada1e2Semana3 {
 
    public static void main(String[] args) {
       
        Objetos.setValor2(300);
        
        Objetos objeto1 = new Objetos(10);
        objeto1.setValor1(20);
        
        System.out.println("Valores são: "+objeto1.getValor1() +" e "+objeto1.calcula());
        
        Objetos objeto2 = new Objetos(10);
        objeto2.setValor1(21);
        
        System.out.println("Valores são: "+objeto2.getValor1() +" e "+objeto2.calcula());
        
        System.out.println("Este objeto é: "+ objeto1);
        System.out.println("Este objeto é: "+ objeto2);
    }
    
}
