package com.springcore.scopes;

public class SingletonBean {
    private int counter = 0;

    public SingletonBean() {
        System.out.println("SingletonBean: Constructor called");
    }

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void displayInfo() {
        System.out.println("SingletonBean instance - Counter: " + counter + 
                         ", HashCode: " + this.hashCode());
    }
}
