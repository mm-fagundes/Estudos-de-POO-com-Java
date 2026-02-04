package Curso3.AplicacaoMusica.TiposAudio;

import Curso3.AplicacaoMusica.Classificador.Classificavel;

public class Asmr extends Audio implements Classificavel {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirDados(){
        System.out.format("""
                Titulo do ASMR: %s
                Categoria do ASMR: %s
                Duração do ASMR: %.2f
                Curtidas: %d
                Reproduções: %d
                """, getTitulo(), getCategoria(), getDuracao(), getTotalCurtidas(), getTotalReproducoes());
    }

    @Override
    public void getRate() {
        int visualizacoes = getTotalReproducoes();
        if(visualizacoes > 3000){
            System.out.println("O rei dos barulhinhos!");
        } else if (visualizacoes > 1000) {
            System.out.println("ASMR MUITO OUVIDO!");
        } else{
            System.out.println("Ótimo ASMR!");
        }
    }
}
