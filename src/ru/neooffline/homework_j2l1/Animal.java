package ru.neooffline.homework_j2l1;

public class Animal implements IRun {
    protected String name;
    private int canRunDistance;
    private boolean onDistance = true;

    public boolean isOnDistance() { return onDistance; }

    public Animal setOnDistance(boolean onDistance){
        this.onDistance = onDistance;
        return this;
    }
    public Animal(){}

    public Animal(String name, int canRunDistance){
        this.name = name;
        this.canRunDistance = canRunDistance;
    }
    public String getName(){return this.name;}

    @Override
    public void run(int distance) {
        if( this.canRunDistance < distance){
            this.onDistance = false;
        }
    }
}
