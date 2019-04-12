package ru.neooffline.homework_j2l1;

public class Duck extends Animal implements ISwimable {
    private final int canSwimDistance;

    public Duck(int canRunDistance, int canSwimDistance){
        super("duck", canRunDistance);
        this.canSwimDistance = canSwimDistance;
    }
    @Override
    public void swim(int distance) {
        if (this.canSwimDistance<distance){
            setOnDistance(false);
        }
        this.status = info() + "заплыв на " + distance +"м.;";
    }
    @Override
    public String info() {
        return isOnDistance()?" прошел ":" не прошел ";
    }
}
