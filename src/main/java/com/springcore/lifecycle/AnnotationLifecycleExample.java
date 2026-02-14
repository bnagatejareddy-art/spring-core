package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AnnotationLifecycleExample {
    
    private String name;

    public AnnotationLifecycleExample() {
        System.out.println("1. AnnotationLifecycleExample: Constructor called");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. AnnotationLifecycleExample: Setter method called");
    }

    @PostConstruct
    public void init() {
        System.out.println("3. AnnotationLifecycleExample: @PostConstruct init() method called");
    }

    public void doWork() {
        System.out.println("4. AnnotationLifecycleExample: Bean is working - " + name);
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("5. AnnotationLifecycleExample: @PreDestroy cleanup() method called");
    }
}
