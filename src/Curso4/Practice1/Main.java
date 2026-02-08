package Curso4.Practice1;

import java.util.Scanner;
public class Main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Mateus");
        pessoa1.setIdade(18);
        pessoa1.setEstadoCivil("Casado");

        pessoa2.setNome("Alany");
        pessoa2.setIdade(20);
        pessoa2.setEstadoCivil("Casado");

        pessoa3.setNome("Dante");
        pessoa3.setIdade(4);
        pessoa3.setEstadoCivil("Solteiro");

        Cadastro cadastro = new Cadastro();
        cadastro.perguntarAddPessoa(sc);
    }
}