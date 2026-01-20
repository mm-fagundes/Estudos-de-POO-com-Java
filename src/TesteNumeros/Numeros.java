package TesteNumeros;

import java.util.Scanner;

public class Numeros {

    public static void ValidarPos(int num) {

        Scanner sc = new Scanner(System.in);
        if(num > 0){
            System.out.println("O número é positivo.");
        } else if (num < 0) {
            System.out.println("O número é negativo.");
        } else{
            System.out.println("O número é zero.");
        }


    }

    public static void Comparar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número para comparação: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2º número para comparação: ");
        double n2 = sc.nextDouble();

        if (n1 == n2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes");
            if (n1 > n2) {
                System.out.println("e o primeiro número é maior.");
            } else if (n1 < n2) {
                System.out.println("e o segundo número é maior.");
            }
        }

    }
    public static void CalcularArea(){

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                [1] Calcular área do quadrado
                [2] Calcular área do circulo
                [3] Sair""");
        int escolha = sc.nextInt();

        if(escolha == 1) {
            System.out.print("Digite o 1º número para o calculo da área do quadrado: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o 2º número para o calculo da área do quadrado: ");
            double n2 = sc.nextDouble();
            double area = n1 * n2;
            System.out.print("A área total é: " + area);
        } else if (escolha == 2) {
            System.out.print("Digite o valor do raio: ");
            double raio = sc.nextDouble();
            double areacirculo = 3.14 * (raio * raio);
            System.out.print("A área total do circulo é: "+areacirculo);
        } else if (escolha == 3) {
            System.out.println("Programa encerrado");
            return;
        } else{
            System.out.println("Escolha invalida, fim do programa");
            return;
        }
    }

    public static void Tabuada() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double n1 = sc.nextDouble();
        for (int i = 1; i < 11; i++) {
            System.out.println(n1 * i);
        }
    }

    public static void ParImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n1 = sc.nextDouble();
        if((n1 % 2) == 0){
            System.out.println("Número par.");
        } else{
            System.out.println("Número impar.");
        }

    }

    public static void Fatoracao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        long resultado = 1;
        for(int i = n1; i > 1; i--){
            resultado *= i;
            System.out.println(resultado);
        }

    }
}
