package Curso4.Practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cadastrar cadastrar = new Cadastrar();


        cadastrar.cadastrarProdutos(sc);
        cadastrar.exibirLista();


    }
}
