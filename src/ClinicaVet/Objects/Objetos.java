package ClinicaVet.Objects;

import ClinicaVet.Animais.Cachorro;
import ClinicaVet.Animais.Gato;
import ClinicaVet.Animais.Animal;
import ClinicaVet.Animais.Porco;


public class Objetos {

    Gato gato1 = new Gato();
    Cachorro cachorro1 = new Cachorro();
    Porco porco1 = new Porco();

    public Objetos() {
        gato1.setNome("Mingau");
        gato1.setIdade(2);
        gato1.setRaca("Persa");
        gato1.setDono("Joaquim");
        gato1.setDoenca("A doenca do gato");
        gato1.setQualidadeDentes("Péssima");
        gato1.setTipoPelagem("Longos e finos");

        cachorro1.setNome("Carcamel");
        cachorro1.setIdade(5);
        cachorro1.setRaca("Vira-Lata");
        cachorro1.setDono("Rubens");
        cachorro1.setDoenca("A doença do cachorro de rua");
        cachorro1.setPorte("Grande");
        cachorro1.setHumor("Amigavel");

        porco1.setNome("Carcamel");
        porco1.setIdade(5);
        porco1.setRaca("Vira-Lata");
        porco1.setDono("Rubens");
        porco1.setDoenca("A doença do cachorro de rua");
        porco1.setSituacao("Abate");
        porco1.setGenero("Masculino");

    }
}
