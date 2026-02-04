package Curso3.ListaExerciciosAluraInterfaces.Ex4;

public class ConversorTemperaturaPadrao implements ConversorTempertura{
    @Override
    public double celsiusParaFahrenheint(double valorCelsius) {
        return (valorCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheintParaCelsius(double valorFahrenheint) {
        return (valorFahrenheint - 32) / 1.8;
    }
}
