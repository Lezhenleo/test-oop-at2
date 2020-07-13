package ru.geekbrain.test.oop.at;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void check(Runner runner) {
        runner.jump ();
        if (runner.getSuccess ()) {
            System.out.println ("Прыгун " + runner.getName () + " перепрыгнул стену высотой: " + height);
        } else {
            System.out.println ("Прыгун " + runner.getName () + " не перепрыгнул стену высотой: " + height);
        }


    }
}
