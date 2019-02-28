package ru.neooffline.homework_j2l1;

import java.util.Random;

public class Team extends Animal {
    private Random rand = new Random();
    private int teamNo = 1;
    private Animal[] animals;
    public Team() {
        animals = new Animal[]{
                new Cat(10, 25),
                new Dog(100, 300, 2),
                new Duck(15, 500)
        };

    }
    public Animal[] getTeam() { return this.animals;}
}
