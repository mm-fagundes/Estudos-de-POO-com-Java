package Curso3.ListaExerciciosAluraInterfaces.Ex4;

public class Main {
    static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheint(100));
        System.out.println(conversorTemperaturaPadrao.fahrenheintParaCelsius(100));

    }
}
