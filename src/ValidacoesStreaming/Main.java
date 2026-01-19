package ValidacoesStreaming;

import ScannerTests.Leitura;

public class Main {

    public static void main(String[] args) {

        // Criando 1º plano.

        Planos plus = new Planos();
        plus.id = 1;
        plus.nome = "Plano Plus";
        plus.vantagens = "Acesso total";



        Planos standart = new Planos();
        standart.id = 2;
        standart.nome = "Plano Standart";
        standart.vantagens = "Acesso Limitado";


        // Criando 1º filme.
        Filmes f1 = new Filmes();
        f1.nome = "Formula Um";
        f1.desc = "Multimilionarios correndo em circulos.";
        f1.anoLacamento = 2024;
        f1.rate = 4.2;
        f1.included = true;

        // Criando 2º filme.
        Filmes f2 = new Filmes();
        f2.nome = "Formula Dois";
        f2.desc = "Multimilionarios correndo em circulos 2.";
        f2.anoLacamento = 2025;
        f1.rate = 1.2;
        f2.included = false;


        // Criando 1ºuser.
        User user1 = new User();
        user1.nome = "Mateus";
        user1.idade = 18;
        user1.idplano = 1;
        user1.plano = plus;

        // Criando 2ºuser.
        User user2 = new User();
        user2.nome = "Mateus";
        user2.idade = 18;
        user2.idplano = 1;
        user2.plano = standart;

        Validacoes.ValidarPlano(f2, user2);
        }




    }







