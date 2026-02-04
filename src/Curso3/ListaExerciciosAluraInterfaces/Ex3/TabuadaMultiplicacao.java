package Curso3.ListaExerciciosAluraInterfaces.Ex3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(double numero) {
        for (int i = 1; i <= 10; i++){
            System.out.println(numero * i);
        }
    }
}
