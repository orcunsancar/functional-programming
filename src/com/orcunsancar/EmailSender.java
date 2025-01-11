package com.orcunsancar;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
