package com.company;

public class Człowiek {

    String imię;
    String nazwisko;
    Zwierzę zwierzę;
    DaneAdresowe daneAdresowe;

    public Człowiek (String imię, String nazwisko) {
        this.imię = imię;
        this.nazwisko = nazwisko;
    }

    public void print (String imię, String nazwisko) {
        System.out.println("Cześć nazwyam się " + imię + " " +nazwisko + ".");
    }

    public void print (String imię, String nazwisko, String info) {
        System.out.println("Cześć nazwyam się " + imię + " " +nazwisko + ". " + info);
    }

}
