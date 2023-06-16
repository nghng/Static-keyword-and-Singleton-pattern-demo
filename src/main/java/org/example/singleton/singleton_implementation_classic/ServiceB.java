package org.example.singleton.singleton_implementation_classic;

public class ServiceB {
    void doBusinessLogicB() {
        Validator validator = Validator.getInstance();
        validator.printStackTrance(this);
    }
}
