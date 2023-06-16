package org.example.singleton.singleton_implementation_classic;

public class ServiceC {
    private ServiceA serviceA = new ServiceA();
    private ServiceB serviceB = new ServiceB();

    void doBusinessLogicC() {
        Validator validator = Validator.getInstance();
        serviceA.doBusinessLogicA();
        serviceB.doBusinessLogicB();
        validator.printStackTrance(this);


    }
}
