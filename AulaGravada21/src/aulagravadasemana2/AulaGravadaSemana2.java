package aulagravadasemana2;

import Imc.Imc;
import Imc.ImcLeitura;
import Imc.ImcNovo;

public class AulaGravadaSemana2 {

    public static void main(String[] args) {
        Imc imc = new Imc(80,1.8);
        imc.setPeso(90);
        ImcNovo imc2 = new ImcNovo(80,1.8);
        ImcLeitura imc3 = new ImcLeitura();
        
        System.out.println("A classificação é "+imc.classificacao());
        System.out.println("A classificação é "+imc2.classificacao());
        
        imc3.lerPeso();
        imc3.lerAltura();
        System.out.println("A classificação é "+imc3.classificacao());
    }
    
}
