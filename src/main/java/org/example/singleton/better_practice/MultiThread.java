package org.example.singleton.better_practice;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        Validator validator = Validator.getInstance();
        validator.printStackTrance(this);
    }
}
