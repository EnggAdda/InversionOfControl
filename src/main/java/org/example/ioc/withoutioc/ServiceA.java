package org.example.ioc.withoutioc;

public class ServiceA {

    private ServiceB   serviceB ;

    public ServiceA() {
       serviceB  = new ServiceB();
    }

    public void perform(){
        serviceB.display();
    }

    public static void main(String[] args) {

        ServiceA    serviceA = new ServiceA();
        serviceA.perform();
    }
}
