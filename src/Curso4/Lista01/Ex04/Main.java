package Curso4.Lista01.Ex04;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        double valor = 0;

        Produto produto1 = new Produto("Doritos" , 10);
        Produto produto2 = new Produto("Ruffles" , 10);

        ArrayList <Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        for(Produto item : listaProdutos){
            valor += item.getPreco();
            System.out.println(item.getPreco());
        }

        double media = valor / listaProdutos.size();
        System.out.println(media);
    }
}
