package ru.neooffline.homework_j2l1;

import java.util.Random;

public class Team{
    private Random rand = new Random();
    private int teamNo = 1;
    private Animal[] animals;
    public Team() {
        animals = new Animal[]{
                new Cat(rand.nextInt(200), rand.nextInt(6)),
                new Dog(rand.nextInt(500), rand.nextInt(400), rand.nextInt(2)),
                new Duck(rand.nextInt(50), rand.nextInt(600))
        };

    }
    public Animal[] getTeam() { return this.animals;}
    public void showResults(){
        for (Animal an:getTeam()) {
            System.out.println(an.getName() + " итого: " + (an.isOnDistance()?"прошел":"непрошел"));
        }
    }
}
