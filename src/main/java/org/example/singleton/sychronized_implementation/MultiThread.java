package org.example.singleton.sychronized_implementation;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        Validator validator = Validator.getInstance();
        validator.printStackTrance(this);
    }
}
