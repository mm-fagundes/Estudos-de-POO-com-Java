package Curso3.ListaExerciciosAluraInterfaces.Ex6;

public class Servico implements Vendavel{
    @Override
    public double precoTotal(double qtd, double valor) {
        if(qtd > 2){
            return (qtd * valor) * 0.8;
        }
        return qtd * valor;
    }
}
