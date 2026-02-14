package com.springcore.scopes;

public class PrototypeBean {
    private int counter = 0;

    public PrototypeBean() {
        System.out.println("PrototypeBean: Constructor called");
    }

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void displayInfo() {
        System.out.println("PrototypeBean instance - Counter: " + counter + 
                         ", HashCode: " + this.hashCode());
    }
}
