package ru.neooffline.homework_j2l1;

public class Course extends Obstacle {
    private Obstacle[] course;
    Course(int size) {
        super(size);
        course = new Obstacle[]{
            new Road(100),
            new Wall(1),
            new Water(100)
        };
    }
    public Obstacle[] getCourse(){
        return this.course;
    }
    @Override
    public void doIt(Animal a) {

    }
}
