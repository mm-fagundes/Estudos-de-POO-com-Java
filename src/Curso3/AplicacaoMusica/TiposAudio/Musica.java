package Curso3.AplicacaoMusica.TiposAudio;

import Curso3.AplicacaoMusica.Classificador.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String cantor;
    private String produtora;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    @Override
    public void exibirDados(){
        System.out.format("""
                Titulo da Musica: %s
                Cantor / Grupo: %s
                Produtora: %s
                Duração: %.2f
                Curtidas: %d
                Reproduções: %d
                """, getTitulo(),  getCantor(),getProdutora(), getDuracao(), getTotalCurtidas(), getTotalReproducoes());
    }

    @Override
    public void getRate() {
        int curtidas = getTotalCurtidas();
        if(curtidas > 100){
            System.out.println("Musica do momento!");
        } else if(curtidas > 70){
            System.out.println("Musica estourada!");
        } else{
            System.out.println("Ótima música!");
        }
    }
}
