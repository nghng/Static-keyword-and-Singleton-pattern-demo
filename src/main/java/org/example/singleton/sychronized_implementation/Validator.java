package org.example.singleton.sychronized_implementation;


public class Validator {
    private static Validator instance;
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Validator() {

    }

    //The main disadvantage of this is method is that using synchronized every time
    // while creating the singleton object is expensive and may decrease the performance of your program.
    // However if performance of getInstance() is not critical for your application this method provides a clean and simple solution.
    //It is expensive because if you are using threads, and a number of threads have to go
    // through a synchronized section of code, only one of them may be executed at a time.
    //
    //It is like a bottleneck.
    //
    //It is even expensive when you use a single thread, because it has to check anyway if he is allowed to run.
    public static synchronized Validator getInstance() {
        if (instance == null)
            instance = new Validator();
        return instance;
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString());
    }


}
