package ru.neooffline.homework_j2l1;

public class Road extends Obstacle {
    protected Road(int size) {
        super(size);
    }

    @Override
    public void doIt(Animal a) {
        a.run(size);
    }
}
