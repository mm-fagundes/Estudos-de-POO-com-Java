package Curso3.AplicacaoMusica.TiposAudio;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalCurtidas;
    private int classificacao;
    private int totalReproducoes;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduzir(){
        totalReproducoes++;
        System.out.println("Reproduzindo: " + getTitulo());
    }

    public void curtir(){
        totalCurtidas++;
    }

    public void exibirDados(){
        System.out.format("""
                Título do Áudio: $s
                Duração do Áudio: %.2f
                Curtidas: %d
                Reproduções: %d
                """, getTitulo(), getDuracao(), getTotalCurtidas(), getTotalReproducoes());
    }







}
