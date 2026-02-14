package com.springcore.app;

import com.springcore.di.ConstructorInjectionExample;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryApp {

    public static void main(String[] args) {
        System.out.println("=== BeanFactory Example ===\n");

        // Create BeanFactory from XML using DefaultListableBeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

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
