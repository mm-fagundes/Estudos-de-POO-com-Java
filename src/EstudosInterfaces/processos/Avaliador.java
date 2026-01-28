package EstudosInterfaces.processos;
import EstudosInterfaces.midias.Titulo;

public class Avaliador {

    public void avaliar(Titulo titulo, double avaliacao){
        titulo.setSomaAvaliacoes(titulo.getSomaAvaliacoes() + avaliacao);
        titulo.setNumeroAvaliacoes(titulo.getNumeroAvaliacoes() + 1);
    }



}
