package EstudosInterfaces.midias;

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
    public double getRate() {
        return 0;
    }
}
