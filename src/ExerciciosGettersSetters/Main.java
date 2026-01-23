package ExerciciosGettersSetters;

import ExerciciosCurso3.Pessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        /* Ex. 2
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Mateus");
        pessoa1.setIdade(18);

        System.out.println("Idade: "+ pessoa1.getIdade());
        pessoa1.validaIdade();
        */


        // Ex. 3

        Produto produto1 = new Produto();
        produto1.setNome("X11");
        produto1.setDescricao("Mouse wirelles com sensor PAW95");
        produto1.setMarca("Attack Shark");
        produto1.setPreco(89.90);


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = sc.nextDouble();
        produto1.setDesconto(desconto);
        produto1.desconto();




    }

}
