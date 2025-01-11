package com.orcunsancar;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jamila", "Alex", "Mariam");
        Consumer<String> stringConsumer = name -> System.out.println(name);

        // names.forEach(stringConsumer);
        names.forEach(name -> System.out.println(name));
    }
}