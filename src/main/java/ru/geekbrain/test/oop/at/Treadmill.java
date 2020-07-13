package ru.geekbrain.test.oop.at;

public class Treadmill implements Obstacles {
    private final int Length;
    private final int length;

    public Treadmill(int length) {
        Length = length;
        this.length = length;
    }

    public void check(Runner runner) {
        runner.run();
        if (runner.getSuccess()) {
            System.out.println("Бегун " + runner.getName() + " пробежал дорожку длиной: " + length);
        } else {
            System.out.println("Бегун " + runner.getName() + " не пробежал дорожку длиной: " + length);
        }
    }

}
