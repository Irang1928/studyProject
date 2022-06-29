package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String args[]) {
        Stream<String> stream1 = Stream.of("code", "irang", "blog", "example");
        System.out.println("stream1");
        stream1.forEach(s -> System.out.println(s));

        System.out.println("---------------");

        Stream<String> stream2 = Stream.empty();
        System.out.println("stream2");
        stream2.forEach(s -> System.out.println(s));

        System.out.println("---------------");

        Stream<String> stream3 = Stream.generate(() -> "Echo").limit(5);
        System.out.println("stream3");
        stream3.forEach(System.out::println);

        System.out.println("---------------");

        Stream<Double> stream4 = Stream.generate(Math::random).limit(5);
        System.out.println("stream4");
        stream4.forEach(System.out::println);

        System.out.println("---------------");

        Stream<Integer> stream5 = Stream.iterate(0, n -> n + 2).limit(5);
        System.out.println("stream5");
        stream5.forEach(System.out::println);

        System.out.println("---------------");

        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1");
        Stream<String> stream6 = list.stream();
        System.out.println("stream6");
        stream6.forEach(System.out::println);

        System.out.println("---------------");

        String[] array = new String[]{"a1", "a2", "b1", "b2", "c2", "c1"};
        Stream<String> stream7 = Arrays.stream(array);
        System.out.println("stream7");
        stream7.forEach(System.out::println);
    }
}
