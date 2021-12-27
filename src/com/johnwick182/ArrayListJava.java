package com.johnwick182;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("John wick");
        name.add("Scooby-doo");
        name.add("Shaggy");
        name.add("Lucifer");

        for (String str: name) {
            System.out.println(name);
        }

        if (name.contains("John wick")) {
            System.out.println("the best");
        }
    }


}
