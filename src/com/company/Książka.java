package com.company;

public class Książka {

    private String tytuł;
    private String autor;
    private int liczbaStron;
    private String wydawnictwo;

    Książka (String tytuł, String autor, int liczbaStron, String wydawnictwo) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.wydawnictwo = wydawnictwo;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    @Override
    public String toString() {
        return "Książka{" +
                "tytuł='" + tytuł + '\'' +
                ", autor='" + autor + '\'' +
                ", liczba stron='" + liczbaStron + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                '}';



    }
}
