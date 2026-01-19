package ScannerTests;

import java.util.Scanner;

public class Leitura{

    static void Calculadora(){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){

            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();

            System.out.println("""
                    Selecione a opção desejada:
                    [1] Somar
                    [2] Subtrair
                    [3] Dividr
                    [4] Multiplicar
                    [5] Sair
                    """);
            int escolha = sc.nextInt();
            sc.nextLine();
            double result;
            String continuar;
            switch (escolha) {
                case 1:
                    result = n1 + n2;
                    System.out.printf("O resultado da operação é: " + result + "\n");
                    System.out.println("Deseja continuar? Use S ou N: ");
                    continuar = sc.nextLine();

                    switch (continuar) {
                        case "N":
                            i = 11;
                            System.out.println("Fim do programa.");
                            break;
                        case "S":
                            break;
                        default:
                            System.out.println("Argumento inválido, fim do programa.");
                            i = 11;
                            break;
                    }
                    break;

                case 2:
                    result = n1 - n2;
                    System.out.printf("O resultado da operação é: " + result + "\n");
                    System.out.println("Deseja continuar? Use S ou N: ");
                    continuar = sc.nextLine();

                    switch (continuar) {
                        case "N":
                            i = 11;
                            System.out.println("Fim do programa.");
                            break;
                        case "S":
                            break;
                        default:
                            System.out.println("Argumento inválido, fim do programa.");
                            i = 11;
                            break;
                    }
                    break;

                case 3:
                    result = n1 / n2;
                    System.out.printf("O resultado da operação é: " + result + "\n");
                    System.out.println("Deseja continuar? Use S ou N: ");
                    continuar = sc.nextLine();
                    switch(continuar) {
                        case "N":
                            i = 11;
                            System.out.println("Fim do programa.");
                            break;
                        case "S":
                            break;
                        default:
                            System.out.println("Argumento inválido, fim do programa.");
                            i = 11;
                            break;
                    }
                    break;

                case 4:
                    result = n1 * n2;
                    System.out.printf("O resultado da operação é: " + result + "\n");
                    System.out.println("Deseja continuar? Use S ou N: ");
                    continuar = sc.nextLine();
                    switch(continuar) {
                        case "N":
                            i = 11;
                            System.out.println("Fim do programa.");
                            break;
                        case "S":
                            break;
                        default:
                            System.out.println("Argumento inválido, fim do programa.");
                            i = 11;
                            break;
                    }
                    break;

                case 5:
                    i = 11;
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Número invalido tente novamente.");
                    break;
            }





        }






    }



}
