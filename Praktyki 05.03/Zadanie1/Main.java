package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj imię");

            String imie = scan.nextLine();
            System.out.println("Podaj nazwisko");

            String nazw = scan.nextLine();
            System.out.println("Podaj rok urodzenia");

            int rok = scan.nextInt();

            try {
                Osoba osoba = new Osoba(imie, nazw, rok);
                System.out.println(osoba);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
