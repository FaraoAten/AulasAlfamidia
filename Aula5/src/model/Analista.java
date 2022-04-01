package model;

public class Analista extends Funcionario{
    
    private String equipamento;

    public Analista(int id, String nome, String email) {
        super(id, nome, email);//super tem que ser usado para passar os atributos da classe pai no construtor, se a classe pai tiver um construtor a filha também deve ter.
    }
    
    public void generaliza(int numero){ //Sobreposição método com mesmo nome do da clase pai, porém recebe atributos diferentes.
        setNome("Analista "+numero);
    }

    @Override //um override ele é um método igual ao da classe pai em nome e parametros recebidos, mudando apenas o funcionamento
    public void setNome(String nome) { //todos os métodos abstratos devem ser sobrescritos nas classes filhas
        this.nome = nome+", O analista";
    }
    
    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "equipamento=" + equipamento + '}'; //super tbm é usado para referenciar a clase pai em certos métodos
    }
}
