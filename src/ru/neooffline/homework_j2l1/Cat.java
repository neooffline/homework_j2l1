package ru.neooffline.homework_j2l1;

public class Cat extends Animal implements IJump {
    private int jumpHeight;
    public Cat(int canRunDistance, int jumpHeight){
        super("cat",canRunDistance);
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void jump(int height) {
        if(this.jumpHeight < height){
            setOnDistance(false);
        }
        this.status = info() + "ןנûזמך םא " + jumpHeight + "ל.; ";
    }
    @Override
    public String info() {
        return isOnDistance()?" ןנמרוכ ":" םו ןנמרוכ ";
    }
}
