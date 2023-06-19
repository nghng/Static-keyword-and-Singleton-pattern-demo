package org.example.singleton.better_practice;


public class Validator {
    private volatile static Validator instance;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Validator() {

    }
    // it should be noted that the double-checked locking is broken prior to Java 5.
    // it's quite verbose and it makes the code difficult to read

    public static Validator getInstance() {

        if (instance == null) {
            synchronized (Validator.class) {
                if (instance == null) {
                    instance = new Validator();
                }
            }
        }
        return instance;
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString());
    }


}
