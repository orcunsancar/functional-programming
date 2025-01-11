package com.orcunsancar;

public class Hotmail implements EmailSender{
    @Override
    public void send() {
        System.out.println("Sending email using hotmail...");
    }
}
