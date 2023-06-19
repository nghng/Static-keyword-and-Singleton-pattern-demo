package org.example.singleton.without_singleton;

public class ServiceA {
    void doBusinessLogicA() {
        Validator validator = new Validator();
        validator.printStackTrace(this);
    }
}
