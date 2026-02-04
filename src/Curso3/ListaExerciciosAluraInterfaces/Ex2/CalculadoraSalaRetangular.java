package Curso3.ListaExerciciosAluraInterfaces.Ex2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{


    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }
    @Override
    public double calcularPerimetro(double altura, double largura) {
        return (altura * 2) + (largura * 2);
    }
}
