package org.example.singleton.thread_problem_with_classic_implementation;

public class Main {
    public static void main(String[] args) {
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
    }
}
