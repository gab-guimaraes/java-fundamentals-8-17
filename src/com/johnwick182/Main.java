package com.johnwick182;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("test" + i);
        }

        double raiz = Math.sqrt(9);
        double absoluteValue = Math.abs(23.32);
        double remath = Math.ceil(23.20);
        double bigger = Math.max(2.3,1.2);
        System.out.println(raiz);
        System.out.println(absoluteValue);
        System.out.println(remath);
        System.out.println(bigger);

        if (Car.sportCar(900)) {
            System.out.println("sport car");
        } else {
            System.out.println("n sport car");
        }
    }
}
