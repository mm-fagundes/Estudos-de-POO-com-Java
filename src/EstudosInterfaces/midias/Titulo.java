package EstudosInterfaces.midias;

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
        if(numeroAvaliacoes == 0){return 0;}
        else{
            double media =  somaAvaliacoes / numeroAvaliacoes;
            if(media <= 2){return 1;}
            else if(media <=4){return 2;}
            else if(media <= 6){return 3;}
            else if(media <= 8){return 4;}
            else if(media <= 10){return 5;}

        }
        return 0;

    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
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
