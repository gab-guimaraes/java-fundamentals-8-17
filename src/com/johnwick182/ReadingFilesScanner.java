package com.johnwick182;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFilesScanner {
    public static void main(String[] args) {

        File file = new File("src/com/johnwick182/enemies.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException ignored) {
            System.out.println(ignored.getMessage());
        }

        System.out.println(file.exists());
    }
}
