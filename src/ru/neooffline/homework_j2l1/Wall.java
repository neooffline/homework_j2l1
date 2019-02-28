package ru.neooffline.homework_j2l1;

public class Wall extends Obstacle {
    protected Wall(int size) {
        super(size);
    }

    @Override
    public void doIt(Animal a) {
        if (a instanceof IJump){
            ((IJump) a).jump(size);
        }
    }
}
