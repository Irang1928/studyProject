package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("java", "kotlin", "haske11", "ruby", "smalltalk");
        System.out.println("sorted:");
        langs.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("reversed:");
        langs.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("----------------------");

        System.out.println("sorted:");
        langs.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println();
        System.out.println("reversed:");
        langs.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        System.out.println("----------------------");

        System.out.println("sorted:");
        final Comparator<String> comp = (p1, p2) -> Integer.compare( p1.length(), p2.length());
        langs.stream().sorted(comp).forEach(System.out::println);
        System.out.println();
        System.out.println("reversed:");
        langs.stream().sorted(comp.reversed()).forEach(System.out::println);
    }
}
