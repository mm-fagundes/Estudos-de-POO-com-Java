package Curso3.ListaExerciciosAluraInterfaces.Ex1;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.20;
    }
}
