package Curso3.EstudosInterfaces.processos;
import Curso3.EstudosInterfaces.midias.Titulo;

public class Avaliador {

    public void avaliar(Titulo titulo, double avaliacao){
        if(avaliacao <= 5) {
            titulo.setSomaAvaliacoes(titulo.getSomaAvaliacoes() + avaliacao);
            titulo.setNumeroAvaliacoes(titulo.getNumeroAvaliacoes() + 1);
        } else{
            System.out.println("A nota maxima permitida é 5.");
        }
    }



}
