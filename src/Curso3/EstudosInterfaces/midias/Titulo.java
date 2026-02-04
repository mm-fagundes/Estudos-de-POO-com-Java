package Curso3.EstudosInterfaces.midias;

public class Titulo{
    private String nome;
    private double somaAvaliacoes = 0;
    private int numeroAvaliacoes = 0;



    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getEstrelas(){
        if(numeroAvaliacoes == 0){return 0;}
        double mediaAvaliacoes = somaAvaliacoes / numeroAvaliacoes;
        if(mediaAvaliacoes <= 0){return 0;}
        if(mediaAvaliacoes <= 1){return 1;}
        if(mediaAvaliacoes <= 2){return 2;}
        if(mediaAvaliacoes <= 3){return 3;}
        if(mediaAvaliacoes <= 4){return 4;}
        if(mediaAvaliacoes <= 5){return 5;}
        return 5;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroAvaliacoes() {
        return numeroAvaliacoes;
    }

    public void setNumeroAvaliacoes(int numeroAvaliacoes) {
        this.numeroAvaliacoes = numeroAvaliacoes;
    }
}
