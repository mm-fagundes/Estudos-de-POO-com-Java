package EstudosInterfaces.Main;

import EstudosInterfaces.midias.Filme;
import EstudosInterfaces.processos.Avaliador;

public class Main {

    static void main(String[] args) {

        Avaliador avaliador = new Avaliador();

        Filme filme1 = new Filme();
        filme1.setNome("Harry Potter");
        filme1.setDuracaoMinutos(180);
        filme1.setDiretor("Chris Columbus");
        filme1.setDescricao("Um grupo de amigos recebe cartas misteriosas...");
        avaliador.avaliar(filme1, 100);
        avaliador.avaliar(filme1, 2);
        avaliador.avaliar(filme1, 8);
        System.out.println(filme1.getSomaAvaliacoes());
    }


}
