package com.springcore.di;

public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email message sent!";
    }
}
