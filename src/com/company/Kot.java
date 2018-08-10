package com.company;

public class Kot extends Zwierzę {

    RasaKota rasaKota;

    public Kot(String imię, int wiek) {
        super(imię, wiek);
    }

    @Override
    public void print () {
        System.out.println("Jestem Kot");
    }
}
