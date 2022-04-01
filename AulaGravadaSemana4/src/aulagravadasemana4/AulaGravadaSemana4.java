package aulagravadasemana4;

import java.util.Scanner;

public class AulaGravadaSemana4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continua = true;
        Cenario mapa = new Cenario();
        
        while(continua){
            
            System.out.println("Entre com posições x e y no formato x,y ou com FIM para sair:");
            String entrada = scanner.next();
            
            if(entrada.equalsIgnoreCase("FIM")){
                continua = false;
            }else{
                String[] posicoes = entrada.split(",");
                int x = Integer.parseInt(posicoes[0]);
                int y = Integer.parseInt(posicoes[1]);
                continua = mapa.disparo(x, y);
                mapa.desenhaCenario();
            }
        }
        
        scanner.close();
    }
    
}
