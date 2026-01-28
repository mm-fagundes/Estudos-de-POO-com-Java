package EstudosInterfaces.midias;

public class Serie extends Titulo implements Classificavel{
    private Temporada temporada;

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public double getRate() {
        return 0;
    }
}
