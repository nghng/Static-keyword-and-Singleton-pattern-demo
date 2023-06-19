package org.example.singleton.eager_instantiation;

public class MultiThread implements Runnable{
    @Override
    public void run() {
//        Validator validator = Validator.getInstance();
        AnotherValidator validator = AnotherValidator.getInstance();
        validator.printStackTrance(this);
    }
}
