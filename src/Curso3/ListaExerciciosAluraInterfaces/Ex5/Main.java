package Curso3.ListaExerciciosAluraInterfaces.Ex5;

public class Main {
    static void main(String[] args) {
        Livro livro1 = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        System.out.println(livro1.valorFinal(100));
        System.out.println(produtoFisico.valorFinal(100));
    }
}
