package model;

public class Aluno {
    private String nome, matricula;
    private double[] notas = new double[3];
    private int i = 0;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double nota) {
        if(i<3){
            double soma = 0;
            for(double n:notas){
                soma += n;
            }
            if((soma+nota)<100){
                this.notas[i] = nota;
                i++;
            }else{
                System.out.println("Não foi possível adicionar a nota, somatório maior que 100, adicione novamente.");
            }
        }else{
            System.out.println("Esse aluno já possui 3 notas.");
        }
    }
}
