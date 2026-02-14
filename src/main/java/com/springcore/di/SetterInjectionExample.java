package com.springcore.di;

public class SetterInjectionExample {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("SetterInjectionExample: Setter method called");
    }

    public void sendMessage() {
        System.out.println("Setter Injection: " + messageService.getMessage());
    }
}
