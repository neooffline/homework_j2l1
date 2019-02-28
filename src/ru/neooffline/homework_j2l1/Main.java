package ru.neooffline.homework_j2l1;

public class Main {

    public static void main(String[] args) {

    Animal[] animals = {
            new Cat(100,30),
            new Dog(100,300,10),
            new Duck(30,500)
    };
    Obstacle[] obstacles = {
            new Road(400),
            new Wall(15),
            new Water(400)
    };
    for (Obstacle ob:obstacles){
        for (Animal an:animals) {
            ob.doIt(an);
        }
    }
        for (Animal an:animals) {
            System.out.println(an.getName() + " on distance " + an.isOnDistance());
        }
    }
}
