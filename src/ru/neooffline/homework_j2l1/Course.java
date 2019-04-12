package ru.neooffline.homework_j2l1;

import java.util.Random;

public class Course {
    private Obstacle[] course;
    Random random = new Random();
    Course() {
        course = new Obstacle[]{
            new Road(random.nextInt(300)),
            new Wall(random.nextInt(4)),
            new Water(random.nextInt(200))
        };
    }
    public Obstacle[] getCourse(){
        return this.course;
    }

}
