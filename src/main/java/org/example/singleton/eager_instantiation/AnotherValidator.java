package org.example.singleton.eager_instantiation;
//Bill Pugh
public class AnotherValidator {
    private static class InstanceHolder {
        private static final AnotherValidator instance = new AnotherValidator();

    }

    public static AnotherValidator getInstance() {
        return InstanceHolder.instance;
    }

    void printStackTrance(Object object) {
        System.out.println("This validator has been created by " + object.getClass() + " with address " + this.toString());
    }
}
