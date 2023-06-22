package org.example;

public class Bird extends Animal{


    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }
}
