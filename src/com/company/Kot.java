package com.company;

public class Kot extends Zwierzę {

    RasaKota rasaKota;

    public Kot(String imię, Integer wiek) {
        super(imię, wiek);
    }

    @Override
    public void print () {
        System.out.println("Jestem Kot");
    }
}
