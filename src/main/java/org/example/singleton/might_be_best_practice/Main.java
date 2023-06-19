package org.example.singleton.might_be_best_practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Might be instantiation");
        Thread thread1 = new Thread(new MultiThread());
        Thread thread2 = new Thread(new MultiThread());
        Thread thread3 = new Thread(new MultiThread());
        Thread thread4 = new Thread(new MultiThread());
        Thread thread5 = new Thread(new MultiThread());
        Thread thread6 = new Thread(new MultiThread());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

//        System.out.println(new Object() == new Object());
//        System.out.println(Validator.INSTANCE == Validator.INSTANCE);
    }
}
