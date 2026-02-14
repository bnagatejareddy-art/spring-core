package com.springcore.di;

public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS message sent!";
    }
}
