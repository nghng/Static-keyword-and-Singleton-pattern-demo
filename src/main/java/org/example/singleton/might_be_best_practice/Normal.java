package org.example.singleton.might_be_best_practice;

public class Normal {
    static int a ;
    private static final staticNormal sd = new staticNormal();

    public Normal() {
        a = 3;


    }

    void das(){

    }

    static class staticNormal{
        int a3 = 3;
        static int a = 3;
        private static int b;
    }


}
