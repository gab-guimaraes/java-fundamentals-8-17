package com.johnwick182.algorithmsDataEstructure.test;

import com.johnwick182.algorithmsDataEstructure.Vector;

public class TestVector {
    public static void main(String[] args) throws Exception {
        Vector vector = new Vector(10);
        vector.add("John Wick");
        vector.add("Scooby-Doo");
        System.out.println(vector.toString());
        System.out.println(vector.search(1));


    }
}
