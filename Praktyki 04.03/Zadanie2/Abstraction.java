package com.company;

public class Abstraction {
    public static void main(String[] args) {
        Cats cat = new Cats();
        cat.cats();
        cat.dogs();
        cat.eat();

        Dogs dog = new Dogs();
        dog.cats();
        dog.dogs();
        dog.eat();

    }
}
