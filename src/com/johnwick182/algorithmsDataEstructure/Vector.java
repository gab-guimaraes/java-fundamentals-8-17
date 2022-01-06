package com.johnwick182.algorithmsDataEstructure;

import java.util.Arrays;

public class Vector {

    private String[] elements;
    private int size;

    public Vector(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

    public void add(String element) throws Exception {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        } else {
            throw new Exception("Vector is Full");
        }
    }

    public String search(int index) throws IllegalAccessException {
        if (!(index >= 0 && index < size)) {
            throw new IllegalAccessException("invalid index");
        } else {
            return elements[index];
        }
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
