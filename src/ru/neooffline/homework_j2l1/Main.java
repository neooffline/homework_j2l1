package ru.neooffline.homework_j2l1;

public class Main {

    public static void main(String[] args) {

    Team team = new Team();
    Course course = new Course(2);
    for (Obstacle ob:course.getCourse()){
        for (Animal an:team.getTeam()) {
            ob.doIt(an);
        }
    }
        for (Animal an:team.getTeam()) {
            System.out.println(an.getName() + " on distance " + an.isOnDistance());
        }
    }
}
