package Curso4.Lista01.Ex06;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void main(String[] args) {


        double pote = 0;
        double menorpote = 1001;
        int idconta = 0;
        int idcontamenor = 0;
        Random rm = new Random();


        ContaBancaria contaBancaria1 = new ContaBancaria(1, rm.nextInt(1000));
        ContaBancaria contaBancaria2 = new ContaBancaria(2, rm.nextInt(1000));
        ContaBancaria contaBancaria3 = new ContaBancaria(3, rm.nextInt(1000));
        ContaBancaria contaBancaria4 = new ContaBancaria(4, rm.nextInt(1000));
        ContaBancaria contaBancaria5 = new ContaBancaria(5, rm.nextInt(1000));
        ContaBancaria contaBancaria6 = new ContaBancaria(6, rm.nextInt(1000));
        ContaBancaria contaBancaria7 = new ContaBancaria(7, rm.nextInt(1000));

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(contaBancaria1);
        listaContas.add(contaBancaria2);
        listaContas.add(contaBancaria3);
        listaContas.add(contaBancaria4);
        listaContas.add(contaBancaria5);
        listaContas.add(contaBancaria6);
        listaContas.add(contaBancaria7);


        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > pote) {
                pote = conta.getSaldo();
                idconta = conta.getNumeroConta();
            }
            if(conta.getSaldo() < menorpote){
                menorpote = conta.getSaldo();
                idcontamenor = conta.getNumeroConta();
            }
        }
        System.out.println("A conta com mais saldo é a conta " + idconta + " com " + pote + " de saldo.");
        System.out.println("A conta com menos saldo é a conta " + idcontamenor + " com " + menorpote + " de saldo.");

        for (ContaBancaria conta : listaContas) {
            System.out.println("A conta " + conta.getNumeroConta() + " possui " + conta.getSaldo() + " de saldo");
        }


    }
}
