package org.example.singleton.eager_instantiation;


public class Validator {

    private static final Validator instance = new Validator();

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Validator() {

    }
    // Use this method only when your singleton class is light
    // and is used throughout the execution of your program.
    // Hard to test

    //it might be computationally expensive (and increase startup time) to create the instance
    //the instance might take up a lot of memory.
    //it has a drawback that [the] instance is created even though client application might not be using it

    public static Validator getInstance() {
        return instance;
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString());
    }


}
