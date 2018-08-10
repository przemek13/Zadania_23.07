package com.company;

public class Zwierzę {

    String imię;
    int wiek;

    public Zwierzę (String imię, int wiek) {
        this.imię = imię;
        this.wiek = wiek;
    }

    public void print () {
        System.out.println("Jestem Zwierzę");
    }

    @Override
    public String toString() {
        return "Zwierz nazywa się: " + imię + " ,a jego wiek w latach to: " + wiek;
    }

}
