package com.company;

public class Pies extends Zwierzę {

    RasaPsa rasaPsa;

    public Pies(String imię, int wiek) {
        super(imię, wiek);
    }

    @Override
    public void print () {
        System.out.println("Jestem Pies");
    }


}
