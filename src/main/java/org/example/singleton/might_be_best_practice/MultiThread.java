package org.example.singleton.might_be_best_practice;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        Validator validator = Validator.INSTANCE;


        validator.printStackTrance(this);
    }
}
