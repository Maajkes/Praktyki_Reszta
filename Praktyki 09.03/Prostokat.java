package com.company;

public class Prostokat implements Figura {
    private int boka = 5;
    private int bokb = 6;
    private int pole;
    private int obwod;

    public void obliczPole() {

        int pole = boka * bokb;

        System.out.println("Pole: \n "+ pole);
    }

    public void obliczObwod() {

        int obwod = boka + boka + bokb + bokb;

        System.out.println("Obwod: \n "+ obwod);
    }
}
