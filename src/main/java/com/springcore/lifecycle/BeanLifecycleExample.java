package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleExample implements InitializingBean, DisposableBean {
    
    private String message;

    public BeanLifecycleExample() {
        System.out.println("1. BeanLifecycleExample: Constructor called");
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("2. BeanLifecycleExample: Setter method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3. BeanLifecycleExample: afterPropertiesSet() called (InitializingBean)");
    }

    public void customInit() {
        System.out.println("4. BeanLifecycleExample: customInit() method called");
    }

    public void doSomething() {
        System.out.println("5. BeanLifecycleExample: Bean is ready to use - " + message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("6. BeanLifecycleExample: destroy() called (DisposableBean)");
    }

    public void customDestroy() {
        System.out.println("7. BeanLifecycleExample: customDestroy() method called");
    }
}
