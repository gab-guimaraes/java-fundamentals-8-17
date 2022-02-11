package com.johnwick182;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Games {
    private String name;
    private LocalDate release;
    private String studio;

    public Games(String name, LocalDate release, String studio) {
        this.name = name;
        this.release = release;
        this.studio = studio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Games{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", studio='" + studio + '\'' +
                '}';
    }
}

public class StreamObject {
    public static void main(String[] args) {
        List<Games> car = new ArrayList<>();
        car.add(new Games("Resident Evil 7",  LocalDate.of(2019,9,7), "CAPCOM"));
        car.add(new Games("God of War 2", LocalDate.of(2010,1,2), "SONY"));
        car.add(new Games("Gran Turismo", LocalDate.of(1999, 2,2), "SONY"));
        car.forEach(x ->
                System.out.println(x.toString()));

        Predicate<Games> after2000 = e -> (e.getRelease().getYear() > 1999);

        System.out.println("Games released after 2000");
        car.stream().filter(after2000).forEach(System.out::println);
    }


}

