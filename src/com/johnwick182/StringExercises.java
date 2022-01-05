package com.johnwick182;

import java.util.ArrayList;
import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        System.out.println("trainning strings java");

        String s1 = "hello world";
        String s2 = "HELLO WORLD";
        System.out.println(s1.charAt(2));

        ArrayList<String> goodfellings = new ArrayList<>();
        goodfellings.add("feliz");
        goodfellings.add("contente");
        goodfellings.add("prazer");
        goodfellings.add("animado");
        goodfellings.add("boa");
        goodfellings.add("bem");
        goodfellings.add("disposto");
        goodfellings.add("esperança");
        goodfellings.add("prazeroso");
        goodfellings.add("relaxado");
        goodfellings.add("confiante");

        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva uma frase que te define hoje");
        String sentence = scanner.nextLine();

        String[] tokens = sentence.split(" ");

        boolean emotionDetected = false;

        for(String token : tokens) {
            if (goodfellings.contains(token)) {
                System.out.println("vejo que esta animado, muito bom");
                emotionDetected = true;
                break;
            }
        }

        if (!emotionDetected)
            System.out.println("nao consegui encontrar sua emocao");


    }
}
