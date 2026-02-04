package Curso3.EstudosInterfaces.midias;

public class Filme extends Titulo implements Classificavel{
    private String diretor;
    private double duracaoMinutos;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String getRate() {
        int estrelas = getEstrelas();
        if(estrelas >= 5){return "Filme favorito atualmente!";}
        if(estrelas >= 3){return "Filme excelente! Altamente recomendado!";}
        return "Esse filme pode esperar, vamos com outro primeiro.";
    }
}
