package com.springcore.app;

import com.springcore.di.ConstructorInjectionExample;
import com.springcore.di.SMSService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryApp {

    public static void main(String[] args) {
        System.out.println("=== BeanFactory Example ===\n");

        // Create BeanFactory from XML
        BeanFactory beanFactory = new XmlBeanFactory(
            new ClassPathResource("applicationContext.xml"));

        System.out.println("BeanFactory created (lazy initialization)\n");

        // Get bean - this is when the bean is actually created
        System.out.println("--- Requesting bean from BeanFactory ---");
        ConstructorInjectionExample bean = 
            beanFactory.getBean("constructorInjection", ConstructorInjectionExample.class);
        
        bean.sendMessage();

        System.out.println("\nNote: BeanFactory uses lazy initialization.");
        System.out.println("Beans are created only when requested, not at container startup.");
    }
}
