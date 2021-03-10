package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kwadrat: ");
        Kwadrat Kwadrat = new Kwadrat();
        Kwadrat.obliczPole();
        Kwadrat.obliczObwod();

        System.out.println("Trójkąt: ");
        Trojkat Trojkat = new Trojkat();
        Trojkat.obliczPole();
        Trojkat.obliczObwod();

        System.out.println("Prostokąt: ");
        Prostokat Prostokat = new Prostokat();
        Prostokat.obliczPole();
        Prostokat.obliczObwod();

    }
}
