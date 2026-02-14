package com.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class FieldInjectionExample {
    
    @Autowired
    private MessageService messageService;

    public void sendMessage() {
        System.out.println("Field Injection: " + messageService.getMessage());
    }
}
