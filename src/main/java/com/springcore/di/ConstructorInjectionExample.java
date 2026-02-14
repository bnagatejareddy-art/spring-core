package com.springcore.di;

public class ConstructorInjectionExample {
    private final MessageService messageService;

    // Constructor Injection
    public ConstructorInjectionExample(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("ConstructorInjectionExample: Constructor called");
    }

    public void sendMessage() {
        System.out.println("Constructor Injection: " + messageService.getMessage());
    }
}
