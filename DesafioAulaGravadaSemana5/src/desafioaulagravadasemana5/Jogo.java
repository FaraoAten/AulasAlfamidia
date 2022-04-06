package desafioaulagravadasemana5;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cenario;

public class Jogo {
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
                ArrayList<String> posicoes = new ArrayList<>();
                posicoes.add(entrada.split(",")[0]);
                posicoes.add(entrada.split(",")[1]);
                int x = Integer.parseInt(posicoes.get(0));
                int y = Integer.parseInt(posicoes.get(1));
                continua = mapa.disparo(x, y);
                mapa.desenhaCenario();
            }
        }
        
        scanner.close();
    }
    
}
