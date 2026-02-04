package Curso3.EstudosInterfaces.midias;

public class Serie extends Titulo implements Classificavel{
    private Temporada temporada;

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String getRate() {
        int estrelas = getEstrelas();
        if(estrelas >= 5){return "Serie favorita atualmente!";}
        if(estrelas >= 3){return "Serie excelente! Altamente recomendada!";}
        return "Essa serie pode esperar, vamos com outra primeiro.";
    }
}
