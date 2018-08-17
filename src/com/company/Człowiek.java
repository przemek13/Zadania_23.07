package com.company;

public class Człowiek {

    private String imię;
    private String nazwisko;
    //TODO czemu zwierzę i daneAdresowe nie są private ?
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
        System.out.println("Cześć nazwyam się " + imię + " " + nazwisko + ". " + info);
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

}
