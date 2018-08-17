package com.company;

public class Pies extends Zwierzę {
    //TODO pola w klasie powinny być private-DONE

    private RasaPsa rasaPsa;

    public Pies(String imię, Integer wiek) {
        super(imię, wiek);
    }

    @Override
    public void print () {
        System.out.println("Jestem Pies");
    }




}
