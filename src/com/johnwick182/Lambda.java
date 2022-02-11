package com.johnwick182;


import java.util.stream.IntStream;

public class Lambda {
    //sintax lambda
    //(parameterList) -> { instruction }
    // (int x, int y) -> { return x + y; }
    // (x, y) -> { return x + y }
    // (x, y) -> x + y


    public static void main(String[] args) {
        int[] values = { 2, 2, 9, 3, 38, 19, 28, 18, 4 };
        System.out.println("Original values");
        IntStream.of(values).forEach(
                (value) -> {
                    if (value > 1) {
                        System.out.println(value);
                    }
                }
        );

        System.out.println("total items: " + IntStream.of(values).count());
        System.out.println("min: " + IntStream.of(values).min().getAsInt());
        System.out.println("sum: " + IntStream.of(values).sum());
        System.out.println("avg: " + IntStream.of(values).average().getAsDouble());
        System.out.println("product: "+ IntStream.of(values).reduce(1, (x,y) -> x * y));

        //pipeline flow
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        IntStream.of(values)
                .filter(value -> value > 17)
                .forEach(System.out::println);

        System.out.println(IntStream.of(values).summaryStatistics());



    }
}
