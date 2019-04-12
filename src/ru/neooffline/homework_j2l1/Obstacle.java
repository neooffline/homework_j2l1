package ru.neooffline.homework_j2l1;

public abstract class Obstacle {
    final int size;
    Obstacle(int size){ this.size = size;}

    public abstract void doIt(Animal a);
}
