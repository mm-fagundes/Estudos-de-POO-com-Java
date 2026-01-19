package SwitchCase;

import ForTests.Media;

import java.util.Random;

public class Main {

    public static void main(String[] args){


        // Switch Case é usado apenas em casos especificos de comparacao de igualdades diretas.

        Random rm = new Random();
        int roleta = rm.nextInt(4);
        int statusPedido = roleta;

        switch (statusPedido) {
            case 1:
                System.out.println("Pedido Aprovado" + roleta);
                break;
            case 2:
                System.out.println("Pedido em processamento" + roleta);
                break;
            case 3:
                System.out.println("Pedido enviado" + roleta);
                break;
            case 0:
                System.out.println("Pedido entregue" + roleta);
                break;
            default:
                System.out.println("Problema no pedido" + roleta);
                break;


        }


    }






}
