package com.springcore.config;

import com.springcore.di.EmailService;
import com.springcore.di.FieldInjectionExample;
import com.springcore.di.MessageService;
import com.springcore.lifecycle.AnnotationLifecycleExample;
import com.springcore.scopes.PrototypeBean;
import com.springcore.scopes.SingletonBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    public MessageService messageService() {
        return new EmailService();
    }

    @Bean
    public FieldInjectionExample fieldInjectionExample() {
        return new FieldInjectionExample();
    }

    @Bean
    public AnnotationLifecycleExample annotationLifecycleExample() {
        AnnotationLifecycleExample bean = new AnnotationLifecycleExample();
        bean.setName("Java Config Bean");
        return bean;
    }

    @Bean
    @Scope("singleton")
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
