package org.example.singleton.singleton_implementation_classic;

public class ServiceA {
    void doBusinessLogicA() {
        Validator validator = Validator.getInstance();
        validator.printStackTrance(this);
    }
}
