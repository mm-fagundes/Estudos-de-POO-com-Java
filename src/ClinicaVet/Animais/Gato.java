package ClinicaVet.Animais;

public class Gato extends Animal {
    private String tipoPelagem;
    private String qualidadeDentes;

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public String getQualidadeDentes() {
        return qualidadeDentes;
    }

    public void setQualidadeDentes(String qualidadeDentes) {
        this.qualidadeDentes = qualidadeDentes;
    }
}
