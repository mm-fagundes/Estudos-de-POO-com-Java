package ProjetoBancoDigital;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {



        for(int i = 0; i == 0;) {


            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    **************************
                        Opções Bancárias
                    [1] Verificar Saldo
                    [2] Adicionar Saldo
                    [3] Transferir Saldo
                    [4] Sair 
                    **************************
                    Escolha: 
                    """);
            int select = sc.nextInt();
            String escolha;
            switch (select) {
                case 1:
                    Recursos.ConferirSaldo();
                    System.out.println("Continuar? S ou N: ");
                    sc.nextLine();
                    escolha = sc.nextLine();
                    if(escolha.equals("N")){
                        System.out.println("Programa encerrado");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("Quantia: ");
                    double valor = sc.nextDouble();
                    Recursos.AdicionarSaldo(valor);
                    sc.nextLine();
                    System.out.println("Continuar? S ou N: ");
                    escolha = sc.nextLine();
                    if(escolha.equals("N")){
                        System.out.println("Programa encerrado");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Quantia: ");
                    double valorr = sc.nextDouble();
                    Recursos.TrasnsferirSaldo(valorr);
                    sc.nextLine();
                    System.out.println("Continuar? S ou N: ");
                    escolha = sc.nextLine();
                    if(escolha.equals("N")){
                        System.out.println("Programa encerrado");
                        return;
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}
