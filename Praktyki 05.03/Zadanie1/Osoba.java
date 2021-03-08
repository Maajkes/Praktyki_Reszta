package com.company;

public class Osoba {
    String imie, nazw;
    int rok;

    private void checkPersonData(String imie, String nazw, int rok) {

        if (imie.isEmpty() == true) {
            throw new IllegalArgumentException("Trzeba wpisać imie");

        } else if (nazw.isEmpty() == true) {
            throw new IllegalArgumentException("Trzeba podać nazwisko");

        } else if ((rok < 1900) || (rok > 2021)) {
            throw new IllegalArgumentException("Zły rok");
        }

    }

    public Osoba(String imie, String nazw, int rok) {

        this.imie = imie;
        this.nazw = nazw;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Osoba:\n " + "\n" +
                "Imie:\n " + imie + "\n" +
                "Nazwisko:\n " + nazw + "\n" +
                "Rok urodzenia:\n " + rok ;
    }
}
