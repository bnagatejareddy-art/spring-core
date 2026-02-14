package com.springcore.app;

import com.springcore.di.ConstructorInjectionExample;
import com.springcore.di.SetterInjectionExample;
import com.springcore.lifecycle.BeanLifecycleExample;
import com.springcore.scopes.PrototypeBean;
import com.springcore.scopes.SingletonBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigApp {

    public static void main(String[] args) {
        System.out.println("=== XML-Based Configuration Example ===\n");

        // Create ApplicationContext from XML
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\n--- Dependency Injection Examples ---");
        
        // Constructor Injection
        System.out.println("\n1. Constructor Injection:");
        ConstructorInjectionExample constructorBean = 
            context.getBean("constructorInjection", ConstructorInjectionExample.class);
        constructorBean.sendMessage();

        // Setter Injection
        System.out.println("\n2. Setter Injection:");
        SetterInjectionExample setterBean = 
            context.getBean("setterInjection", SetterInjectionExample.class);
        setterBean.sendMessage();

        System.out.println("\n--- Bean Lifecycle Example ---");
        BeanLifecycleExample lifecycleBean = 
            context.getBean("beanLifecycle", BeanLifecycleExample.class);
        lifecycleBean.doSomething();

        System.out.println("\n--- Bean Scopes Examples ---");
        
        // Singleton Scope
        System.out.println("\n3. Singleton Scope:");
        SingletonBean singleton1 = context.getBean("singletonBean", SingletonBean.class);
        singleton1.incrementCounter();
        singleton1.displayInfo();
        
        SingletonBean singleton2 = context.getBean("singletonBean", SingletonBean.class);
        singleton2.incrementCounter();
        singleton2.displayInfo();
        
        System.out.println("Are both singleton instances same? " + (singleton1 == singleton2));

        // Prototype Scope
        System.out.println("\n4. Prototype Scope:");
        PrototypeBean prototype1 = context.getBean("prototypeBean", PrototypeBean.class);
        prototype1.incrementCounter();
        prototype1.displayInfo();
        
        PrototypeBean prototype2 = context.getBean("prototypeBean", PrototypeBean.class);
        prototype2.incrementCounter();
        prototype2.displayInfo();
        
        System.out.println("Are both prototype instances same? " + (prototype1 == prototype2));

        // Close context
        System.out.println("\n--- Closing Application Context ---");
        context.close();
    }
}
