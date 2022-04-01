
package Imc;

public class Imc {
    private double peso, altura, imc;

    public Imc() {
    }
    
    public Imc(double peso, double altura){
        this.peso=peso;
        this.altura=altura;
    }
    
    public void calculaImc(){
        this.imc = this.peso/(this.altura*this.altura);
    }
    
    public String classificacao(){
        calculaImc();
        if(this.imc<18.5) return "Magreza";
        if(this.imc<24.9) return "Normal";
        if(this.imc<29.9) return "Sobrepeso";
        if(this.imc<39.9) return "Obesidade";        
        return "Obesidade grave";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }
    
    
}
