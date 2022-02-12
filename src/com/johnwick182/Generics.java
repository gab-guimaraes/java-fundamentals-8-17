package com.johnwick182;

public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = { 1.0, 2.0};
        Character[] characters = {'H', 'I'};

        print(intArray);
        print(doubleArray);
        print(characters);
    }

    public static<T> void print(T[] input) {
        for (T element: input) {
            System.out.println(element);
        }
    }
}
