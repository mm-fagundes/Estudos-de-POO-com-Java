package Curso4.Lista01.Ex05;

public class Quadrado implements Forma{
    double ladoA;
    double ladoB;

    public Quadrado(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calculaArea() {
        return ladoA * ladoB;
    }
}
