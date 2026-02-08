package Curso4.Lista01.Ex01_02_03;

public class Cachorro extends Animal{
    private String tipoLatido;

    public String getTipoLatido() {
        return tipoLatido;
    }

    public void setTipoLatido(String tipoLatido) {
        this.tipoLatido = tipoLatido;
    }

    public Cachorro(String nome) {
        super(nome);
    }


}
