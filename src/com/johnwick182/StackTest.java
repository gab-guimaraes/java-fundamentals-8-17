package com.johnwick182;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(12L);
        stack.push(20L);
        stack.push(38L);
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack);
        }
    }
}
