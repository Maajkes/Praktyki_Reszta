package com.company;

public class Kwadrat implements Figura{

    private int bok = 5;
    private int pole;
    private int obwod;

    public void obliczPole() {

        int pole = bok * bok;

        System.out.println("Pole: \n "+ pole);
    }

    public void obliczObwod() {

        int obwod = bok + bok + bok + bok;

        System.out.println("Obwod: \n "+ obwod);
    }
}
