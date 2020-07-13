package ru.geekbrain.test.oop.at;

public interface Runner {String getName();
    int getMaxLength();

    boolean getSuccess();
    void setSuccess(boolean success);
    void  run();
    void jump();

    boolean getHeight();
}
