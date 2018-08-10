package com.company;

public class Książka {

    String tytuł;
    String autor;
    int liczbaStron;
    String wydawnictwo;

    Książka (String tytuł, String autor, int liczbaStron, String wydawnictwo) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
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
