package ru.neooffline.homework_j2l1;

public class Dog extends Animal implements ISwimable,IJump,IRun {
    private final int canSwimDistance;
    private final int jumpHeight;
    protected Dog(int canSwimDistance, int runDistance, int jumpHeight){
        super("Dog",runDistance);
        this.canSwimDistance = canSwimDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump(int height) {
        if (this.jumpHeight < height){
            setOnDistance(false);
        }
    }

    @Override
    public void swim(int distance) {
        if(this.canSwimDistance < distance){
            setOnDistance(false);
        }
    }
    @Override
    public void run(int dist){
        super.run(dist);
    }
}
