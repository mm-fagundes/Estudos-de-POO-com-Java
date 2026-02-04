package Curso3.AplicacaoMusica.TiposAudio;

import Curso3.AplicacaoMusica.Classificador.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String anfitriao;

    public String getAnfitriao() {
        return anfitriao;
    }

    public void setAnfitriao(String anfitriao) {
        this.anfitriao = anfitriao;
    }

    @Override
    public void exibirDados(){
        System.out.format("""
                Titulo do Podcast: %s
                Anfitrião: %s
                Duração: %.2f
                Curtidas: %d
                Reproduções: %d
                """, getTitulo(), getAnfitriao(), getDuracao(), getTotalCurtidas(), getTotalReproducoes());
    }

    @Override
    public void getRate() {
        int visualizacoes = getTotalReproducoes();
        if(visualizacoes > 10000){
            System.out.println("Flow Podcast?");
        } else if(visualizacoes > 7000){
            System.out.println("Inteligencia LTDA?");
        } else {
            System.out.println("Podpah talvez?");
        }
    }
}
