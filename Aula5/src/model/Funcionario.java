package model;

public abstract class Funcionario { //classes abstratas assim como interfaces não podem ser instânciadas, serve apenas para ser instânciada
    protected int id;
    protected String nome, email;

    public Funcionario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
    public void generaliza(){
        setNome("Funcionário");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public abstract void setNome(String nome);// métodos abstratos não podem ter corpo e só classes abstratas podem tê-los
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nome=" + nome + ", email=" + email;
    }
}
