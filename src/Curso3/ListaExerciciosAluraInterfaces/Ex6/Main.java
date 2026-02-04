package Curso3.ListaExerciciosAluraInterfaces.Ex6;

public class Main {
    static void main(String[] args) {
        Produto produto1 = new Produto();
        Servico servico1 = new Servico();
        System.out.println(produto1.precoTotal(11, 100));
        System.out.println(servico1.precoTotal(3, 10));
    }
}
