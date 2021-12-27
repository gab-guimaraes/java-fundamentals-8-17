package com.johnwick182;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Studying arrays in Java");
        int[] c = new int[12];
        System.out.println(c.length);

        String[] array;
        array = new String[10];

        //starting array with values
        int[] n = { 10, 20, 30, 40, 50, 60, 70};

        for (int j : n) {
            System.out.println(j);
        }
    }
}
