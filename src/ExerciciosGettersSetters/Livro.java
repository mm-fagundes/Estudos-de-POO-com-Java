package ExerciciosGettersSetters;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void exibirDetalhes(){
        System.out.format("""
                Titulo do Livro: %s
                Nome do Autor: %s
                """, this.autor, this.titulo);
    }
}
