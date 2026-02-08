package Curso4.Lista01.Ex05;

public class Circulo implements Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return (3.14 * (raio * raio));
    }
}
