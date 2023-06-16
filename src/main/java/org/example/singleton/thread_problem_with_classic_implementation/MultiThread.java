package org.example.singleton.thread_problem_with_classic_implementation;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        Validator validator = Validator.getInstance();
        validator.printStackTrance(this);
    }
}
