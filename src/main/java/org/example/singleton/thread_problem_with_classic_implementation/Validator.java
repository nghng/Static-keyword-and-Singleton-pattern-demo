package org.example.singleton.thread_problem_with_classic_implementation;


public class Validator {
    private static Validator instance;

    private Validator() {

    }

    // private constructor to force use of
    // getInstance() to create Singleton object
    public static Validator getInstance() {
        if (instance == null)
            instance = new Validator();
        return instance;
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString());
    }


}
