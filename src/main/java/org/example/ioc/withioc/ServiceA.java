package org.example.ioc.withioc;

public class ServiceA {

    private ServiceB serviceB ;

    public ServiceA(ServiceB serviceB) {
      this.serviceB = serviceB;
    }

    public void perform(){
        serviceB.display();
    }

    public static void main(String[] args) {
        ServiceB serviceB = new ServiceB();
        ServiceA    serviceA = new ServiceA(serviceB);
        serviceA.perform();
    }
}
