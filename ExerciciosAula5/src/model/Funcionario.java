package model;

public class Funcionario {
    private String nome, função, cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, String função, String cargo) {
        this.nome = nome;
        this.função = função;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", fun\u00e7\u00e3o=" + função + ", cargo=" + cargo + '}';
    }
}
