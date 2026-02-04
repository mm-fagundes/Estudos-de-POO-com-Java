package Curso3.ListaExerciciosAluraInterfaces.Ex6;

public class Produto implements Vendavel{
    @Override
    public double precoTotal(double qtd, double valor) {
        if(qtd > 10){
            return (qtd * valor) * 0.9;
        }
        return qtd * valor;
    }
}
