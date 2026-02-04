package Curso3.EstudosInterfaces.Main;

import Curso3.EstudosInterfaces.midias.Filme;
import Curso3.EstudosInterfaces.processos.Avaliador;

public class Main {

    static void main(String[] args) {

        Avaliador avaliador = new Avaliador();

        Filme filme1 = new Filme();
        filme1.setNome("Harry Potter");
        filme1.setDuracaoMinutos(180);
        filme1.setDiretor("Chris Columbus");
        filme1.setDescricao("Um grupo de amigos recebe cartas misteriosas...");
        System.out.println(filme1.getEstrelas() + " Estrelas");
        System.out.println(filme1.getRate());
    }


}
