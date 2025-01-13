package com.orcunsancar;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmailValidator emailValidator = new EmailValidator();

        List<String> emails = List.of(
                "hello@gmail.com",
                "hellogmail.com"
        );

        emails.forEach(email -> {
            var isValid = emailValidator.apply(email);
            System.out.printf("Email %s is valid: %s%n", email, isValid);
        });
    }
}