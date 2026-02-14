package com.springcore.app;

import com.springcore.config.JavaConfig;
import com.springcore.di.FieldInjectionExample;
import com.springcore.lifecycle.AnnotationLifecycleExample;
import com.springcore.scopes.PrototypeBean;
import com.springcore.scopes.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {
        System.out.println("=== Java-Based Configuration Example ===\n");

        // Create ApplicationContext from Java Config
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("\n--- Dependency Injection Examples ---");
        
        // Field Injection
        System.out.println("\n1. Field Injection:");
        FieldInjectionExample fieldBean = 
            context.getBean(FieldInjectionExample.class);
        fieldBean.sendMessage();

        System.out.println("\n--- Bean Lifecycle Example ---");
        AnnotationLifecycleExample lifecycleBean = 
            context.getBean(AnnotationLifecycleExample.class);
        lifecycleBean.doWork();

        System.out.println("\n--- Bean Scopes Examples ---");
        
        // Singleton Scope
        System.out.println("\n2. Singleton Scope:");
        SingletonBean singleton1 = context.getBean(SingletonBean.class);
        singleton1.incrementCounter();
        singleton1.displayInfo();
        
        SingletonBean singleton2 = context.getBean(SingletonBean.class);
        singleton2.incrementCounter();
        singleton2.displayInfo();
        
        System.out.println("Are both singleton instances same? " + (singleton1 == singleton2));

        // Prototype Scope
        System.out.println("\n3. Prototype Scope:");
        PrototypeBean prototype1 = context.getBean(PrototypeBean.class);
        prototype1.incrementCounter();
        prototype1.displayInfo();
        
        PrototypeBean prototype2 = context.getBean(PrototypeBean.class);
        prototype2.incrementCounter();
        prototype2.displayInfo();
        
        System.out.println("Are both prototype instances same? " + (prototype1 == prototype2));

        // Close context
        System.out.println("\n--- Closing Application Context ---");
        context.close();
    }
}
