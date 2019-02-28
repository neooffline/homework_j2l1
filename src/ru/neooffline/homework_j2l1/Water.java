package ru.neooffline.homework_j2l1;

public class Water extends Obstacle {
    protected Water(int size) {
        super(size);
    }

    @Override
    public void doIt(Animal a) {
        if (a instanceof ISwimable){
            ((ISwimable) a).swim(size);
        } else {
            a.setOnDistance(false);
        }
    }
}
