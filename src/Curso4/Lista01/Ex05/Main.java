package Curso4.Lista01.Ex05;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Circulo circulo = new Circulo(4);
        Quadrado quadrado = new Quadrado(10, 10);

        circulo.calculaArea();
        quadrado.calculaArea();

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for(Forma formas: listaFormas){
            System.out.println(formas.calculaArea());
        }



    }
}
