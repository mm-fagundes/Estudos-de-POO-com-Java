package Curso3.EstudosInterfaces.midias;

public class Episodio extends Titulo{
    private double duracaoEpisodio;
    private Serie serie;
    private Temporada temporada;

    public double getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(double duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

}
