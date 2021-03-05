package com.company;

public class Main {

    public static void main(String[] args) {

        BankA banka = new BankA();
        banka.getBalance();
        banka.AcountState("Millenium");

        BankB bankb = new BankB();
        bankb.getBalance();
        bankb.AcountState("mBank");

        BankC bankc = new BankC();
        bankc.getBalance();
        bankc.AcountState("ING");
    }
}