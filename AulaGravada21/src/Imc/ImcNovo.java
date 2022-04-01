package Imc;

public class ImcNovo extends Imc{ //extends = herança
    public ImcNovo(double peso, double altura){
        super(peso,altura);//chama o construtor da classe pai;
    }
    
    @Override
    public String classificacao(){
        calculaImc();
        if(getImc()<16) return "Magreza grave";
        if(getImc()<17) return "Magreza moderada";
        if(getImc()<18.5) return "Magreza leve";
        if(getImc()<25) return "Saudável";
        if(getImc()<30) return "Sobrepeso";
        if(getImc()<35) return "Obesidade grau 1";        
        if(getImc()<40) return "Obesidade grau 2";        
        return "Obesidade grau 3";
    }
}
