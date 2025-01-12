package com.orcunsancar;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        sendEmailBiConsumer.accept("hello@amigoscode.com", "alexu@amigoscode.com");
    }

    static BiConsumer<String, String> sendEmailBiConsumer =
            (from, to) -> System.out.printf("Sending email from %s to %s%n", from,  to);

    static void sendEmail(String from, String to) {
        System.out.printf("Sending email from %s to %s%n", from,  to);
    }
}