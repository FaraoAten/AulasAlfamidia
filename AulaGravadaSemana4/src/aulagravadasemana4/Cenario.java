package aulagravadasemana4;

public class Cenario {
    private int[][] mapa;
    private String[] desenhos;
    private Pecas[] inimigos;
    private int contInimigos, contTiros;

    public Cenario() {
        this.contInimigos = 5;
        this.contTiros = 25;
        this.mapa = new int[10][10];
        desenhos = new String[] {".","X","*"};
        inimigos = new Pecas[this.contInimigos];
        for(int i=0;i<inimigos.length;i++){
            inimigos[i] = new Pecas();
        }
    }
    
    public void desenhaLinha(int[] linha){
        String strLinha = "";
        
        for(int celula:linha){
            strLinha+= desenhos[celula]+" ";
        }
        
        System.out.println(strLinha);
    }
    
    public void desenhaCenario(){
        for(int[] linha:this.mapa){
            this.desenhaLinha(linha);
        }
        System.out.println("Inimigos Restantes: "+contInimigos);
        System.out.println("Tiros Restantes: "+contTiros+"\n");
    }
    
    public boolean disparo(int x, int y){
        contTiros--;
        double menor = 100;
        for(Pecas inimigo:inimigos){
            if(inimigo.isVivo()){
                double distanciaInimigo = inimigo.calculaDistancia(x, y);
                if(distanciaInimigo==0.0){
                    contInimigos--;
                }
                if(distanciaInimigo < menor){
                    menor = distanciaInimigo;
                }
            }
        }
        System.out.println("==================================================");
        System.out.println("Distancia do inimigo mais próximo: "+menor);
        System.out.println("==================================================");
        if(menor == 0.0){
            mapa[y][x] = 2;
        }else{
            mapa[y][x] = 1;
        }
        
        return (contTiros > 0 && contInimigos > 0);
    }
}
