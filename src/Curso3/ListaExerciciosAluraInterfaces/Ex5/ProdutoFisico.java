package Curso3.ListaExerciciosAluraInterfaces.Ex5;

public class ProdutoFisico implements Calculavel{
    @Override
    public double valorFinal(double valor) {
        // Valor final do produto fisico possui 50% de imposto.
        return valor * 1.5;
    }
}
