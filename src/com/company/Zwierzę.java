package com.company;

public class Zwierzę {

    private String imię;
    private Integer wiek;

    public Zwierzę (String imię, Integer wiek) {
        this.imię = imię;
        this.wiek = wiek;
    }

    public void print () {
        System.out.println("Jestem Zwierzę");
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    //TODO metoda toString powinna być na końcu klasy-DONE

    @Override
    public String toString() {
        return "Zwierz nazywa się: " + imię + " ,a jego wiek w latach to: " + wiek;
    }

}
