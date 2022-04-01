package model;

public class Coordenador extends Funcionario{
    private String setor;

    public Coordenador(String setor, int id, String nome, String email) {
        super(id, nome, email);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return ", " + "setor=" + setor + '}';
    }    

    @Override
    public void setNome(String nome) {//todos os métodos abstratos devem ser sobrescritos nas classes filhas
        this.nome = nome;
    }
}
