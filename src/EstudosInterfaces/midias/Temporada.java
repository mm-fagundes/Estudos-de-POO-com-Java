package EstudosInterfaces.midias;

public class Temporada extends Titulo implements Classificavel{
    private Serie serie;
    private int quantidadeEpisodios;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    @Override
    public double getRate() {
        return 0;
    }
}
