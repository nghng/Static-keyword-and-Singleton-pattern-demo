package org.example.singleton.without_singleton;

public class ServiceC {
   private ServiceA serviceA = new ServiceA();
   private ServiceB serviceB = new ServiceB();
    void doBusinessLogicC(){
        Validator validator = new Validator();
        serviceA.doBusinessLogicA();
        serviceB.doBusinessLogicB();
        validator.printStackTrace(this);


    }
}
