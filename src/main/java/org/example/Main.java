package org.example;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Škoda","Octavia", 2006);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());




        Dog dog = new Dog("Tina", 6);
        Bird bird = new Bird("Ara", 3);

        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();
    }




}