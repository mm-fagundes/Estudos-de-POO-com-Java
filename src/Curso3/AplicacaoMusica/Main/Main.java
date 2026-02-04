package Curso3.AplicacaoMusica.Main;

import Curso3.AplicacaoMusica.TiposAudio.Asmr;
import Curso3.AplicacaoMusica.TiposAudio.Musica;
import Curso3.AplicacaoMusica.TiposAudio.Podcast;

public class Main {
    static void main(String[] args) {
        Musica musica1 = new Musica();
        Podcast podcast1 = new Podcast();
        Asmr asmr1 = new Asmr();

        musica1.setTitulo("P do Pecado");
        musica1.setCantor("Menos é Mais");
        musica1.setProdutora("Pagode Brasil");
        musica1.setDuracao(3.5);
        musica1.reproduzir();
        musica1.curtir();


        podcast1.setTitulo("Flow Podcast");
        podcast1.setAnfitriao("Igor do Flow");
        podcast1.setDuracao(200);
        podcast1.reproduzir();
        podcast1.curtir();


        asmr1.setTitulo("ASMR Para Dormir");
        asmr1.setCategoria("Relaxante");
        asmr1.setDuracao(20);
        asmr1.reproduzir();
        asmr1.curtir();


        musica1.exibirDados();
        podcast1.exibirDados();
        asmr1.exibirDados();










    }
}
