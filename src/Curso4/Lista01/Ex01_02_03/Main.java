package Curso4.Lista01.Ex01_02_03;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Ralph");
        cachorro1.setTipoLatido("Au Au");
        Cachorro cachorro2 = new Cachorro("Fred");
        Cachorro cachorro3 = new Cachorro("Simba");

        ArrayList <Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(cachorro1);
        listaAnimais.add(cachorro2);
        listaAnimais.add(cachorro3);

        for (Animal item : listaAnimais) {
            if(item instanceof Cachorro cachorro){
                System.out.println(cachorro.getTipoLatido());
            }


        }



    }

}
