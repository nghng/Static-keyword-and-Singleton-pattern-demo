package org.example.singleton.without_singleton;

public class ServiceB {
    void doBusinessLogicB() {
        Validator validator = new Validator();
        validator.printStackTrance(this);
    }
}
