package Curso3.ListaExerciciosAluraInterfaces.Ex5;

public class Livro implements Calculavel{
    @Override
    public double valorFinal(double valor) {
        // Valor final de livros possui 10% de imposto.
        return valor * 1.1;
    }
}
