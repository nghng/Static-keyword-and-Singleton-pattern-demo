package org.example.singleton.might_be_best_practice;


public enum Validator {
    INSTANCE;

   //by default enums have implicit private constructor

    //, provides the serialization machinery for free
    //While this approach has yet to be widely
    //adopted, a single-element enum type is the best way to implement a singleton -Joshua Boch


    Validator() {
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.hashCode());
    }


}
