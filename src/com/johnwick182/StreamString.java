package com.johnwick182;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamString {
    public static void main(String[] args) {
        System.out.println("Stream Strings Operations");

        String[] strings = { "Red", "Orange", "Value", "violet", "grAy"};

        System.out.println("Strings in uppercase");
        Arrays.stream(strings)
                .map(String::toUpperCase)
                .filter(x -> (x.startsWith("OR")))
                .toList()
                .forEach(System.out::println);
    }
}
