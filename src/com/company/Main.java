package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        //KLASY I DZIEDZICZENIE

        //Zadanie1

        Pies pies = new Pies("Czarek", 5);
        Kot kot = new Kot("Białek", 3);

        System.out.println(pies);
        System.out.println(kot);

        //Zadanie2

        pies.print();
        kot.print();

        //Zadanie3

        // bez wyświetlania

        //Zadanie 4

        Człowiek człowiek1 = new Człowiek("Zenek", "Nowak");
        Człowiek człowiek2 = new Człowiek("Edek", "Kowalski");

        człowiek1.zwierzę = pies;
        człowiek2.zwierzę = kot;

        //Zadanie 5

        człowiek1.print("Radek", "Nowy");
        człowiek2.print("Janusz", "Siwy", "Kocham zwierzęta.");

        //Zadanie 6

        List<String> list1 = new ArrayList<String>(10);

        for (int i = 0; i < 10; i++) {
            list1.add("word " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        for (String word : list1) {
            System.out.print(word + " ");
        }

        System.out.println();

        //Zadanie 7

        List<Integer> list2 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        for (Integer number : list2) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(list2.size());

        list2.remove(0);
        list2.remove(list2.size() - 1);

        System.out.println(list2.size());

        //Zadanie 8

        Książka książka1 = new Książka("Tytuł1", "Autor1", 10, "Wydawnictwo1");
        Książka książka2 = new Książka("Tytuł2", "Autor2", 20, "Wydawnictwo2");
        Książka książka3 = new Książka("Tytuł3", "Autor3", 30, "Wydawnictwo3");
        Książka książka4 = new Książka("Tytuł4", "Autor4", 40, "Wydawnictwo4");
        Książka książka5 = new Książka("Tytuł5", "Autor5", 50, "Wydawnictwo5");
        Książka książka6 = new Książka("Tytuł6", "Autor6", 60, "Wydawnictwo6");
        Książka książka7 = new Książka("Tytuł7", "Autor7", 70, "Wydawnictwo7");
        Książka książka8 = new Książka("Tytuł8", "Autor8", 80, "Wydawnictwo8");
        Książka książka9 = new Książka("Tytuł9", "Autor9", 90, "Wydawnictwo9");
        Książka książka10 = new Książka("Tytuł10", "Autor10", 100, "Wydawnictwo10");
        Książka książka11 = new Książka("Tytuł11", "Autor11", 1000, "Wydawnictwo11");

        List<Książka> listaKsiążek = new ArrayList((Arrays.asList(
                książka1,
                książka2,
                książka3,
                książka4,
                książka5,
                książka6,
                książka7,
                książka8,
                książka9,
                książka10,
                książka11
        )));

        for (Książka wypisz : listaKsiążek) {
            System.out.println(wypisz);
        }

        listaKsiążek.remove((listaKsiążek.size() / 2));

        System.out.println(listaKsiążek.size());

        for (Książka wypisz : listaKsiążek) {
            if (wypisz.getLiczbaStron() >= 200) {
                System.out.println(wypisz);
            }
        }

        //Zadanie 9

        List<Książka> listaKsiążek2 = new ArrayList<Książka>();
        listaKsiążek2.add(new Książka("Tytuł12", "Autor12", 100, "Wydawnictwo12"));
        listaKsiążek2.add(new Książka("Tytuł13", "Autor13", 200, "Wydawnictwo13"));
        listaKsiążek2.add(new Książka("Tytuł14", "Autor14", 300, "Wydawnictwo14"));
        listaKsiążek2.add(new Książka("Tytuł15", "Autor15", 400, "Wydawnictwo15"));

        listaKsiążek.addAll(listaKsiążek2);

        System.out.println(listaKsiążek.size());

        System.out.println();

        for (Książka wypisz : listaKsiążek) {
            System.out.println(wypisz);

        }

        //Zadanie 10

        Scanner sc = new Scanner(System.in);

        String imie = " ";

        List<String> imiona = new ArrayList<String>();

        while (true) {

            System.out.println("Podaj imiona, END kończy zbiór.");

            imie = sc.nextLine();

            //TODO tutaj masz błąd. Gdy dodam 2 raz to samo imie to zostanie dodane i tak do listy.
            if(imiona.contains(imie)) {
                System.out.println("Te imię jest już na liście");
            }
            //TODO tutaj powinieneś dodać else if oraz else łącząc sprawdzenie czy to END a jak nie to dodaj do tablicy

            if (!imie.equals("END")) {

                imiona.add(imie);

            }

            else
                break;

        }

        System.out.println("Ilość wpisanych imion: " + imiona.size());
        System.out.println(imiona);

        System.out.println();

        // Zadanie 11

        Scanner input = new Scanner(System.in);

        String word = " ";

        String reversedWord = " ";

        Set <String> words = new TreeSet<String>();
        Set<String> reversedWords = new TreeSet<String>();

        while (true) {

            System.out.println("Please, write unique palindromes only: ");

            StringBuilder input2 = new StringBuilder();
            word = input.next();
            input2.append(word);
            reversedWord = new String(input2.reverse());

            if (!word.equals("END")) {

                if (!word.equals(reversedWord)) {
                    System.out.println("Sorry, this word is not a palindrome.");
                }

                else if(!words.contains(word)) {

                    words.add(word);
                    reversedWords.add(reversedWord);
                }

                else {
                    System.out.println("Sorry, the words can not repeat themselves.");
                }

            } else
                break;

        }

        System.out.println("The palindromes you've enterd are: " + words);

    }
}
