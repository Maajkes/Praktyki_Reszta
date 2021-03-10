package com.company;

public class Trojkat implements Figura {
    private int podst = 8;
    private int ramiea = 6;
    private int ramieb = 7;
    private int wysokosc = 9;
    private int pole;
    private int obwod;

    public void obliczPole() {

        int pole = (podst * wysokosc) / 2;

        System.out.println("Pole: \n " + pole);
    }

    public void obliczObwod() {

        int obwod = podst + ramiea + ramieb;

        System.out.println("Obwod: \n " + obwod);
    }
}

