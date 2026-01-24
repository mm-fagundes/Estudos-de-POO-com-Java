package ClinicaVet.Animais;

public class Animal {
    private String nome;
    private int idade;
    private String raca;
    private String dono;
    private String doenca;

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeFicha(Animal animal){
        System.out.format("""
                Animal: %s
                Nome: %s
                Idade: %d
                Raça: %s
                Nome do Dono: %s
                Doença: %s
                """ , getClass().getSimpleName(),getNome(), getIdade(), getRaca(), getDono(),getDoenca());
    }








}
