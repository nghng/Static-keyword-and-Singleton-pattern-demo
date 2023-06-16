package org.example.singleton.without_singleton;



public class Validator {
    void printStackTrance(Object object){
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString() );
    }
}
