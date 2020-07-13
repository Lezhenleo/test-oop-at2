package ru.geekbrain.test.oop.at;

public class Robot implements Runner { private String name;
    private int maxHeight;
    private  int maxLength;
    private  boolean success = true;
    public  Robot (String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }
    public void run(){
        System.out.println (name + "Бежит максимум: " + maxLength);
    }
    public void jump(){
        System.out.println (name + "Прыгает максимум:" + maxHeight);
    }

    public boolean getHeight() {
        return false;
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxWeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


}
