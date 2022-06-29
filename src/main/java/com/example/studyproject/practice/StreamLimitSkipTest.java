package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitSkipTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10" );
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = stream1.limit(5);
        stream2.forEach(System.out::println);

        System.out.println("---------------------");

        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        randoms.forEach(System.out::println);

        System.out.println("---------------------");

        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10" );
        Stream<String> stream3 = list2.stream();
        Stream<String> stream4 = stream3.skip(5);
        stream4.forEach(System.out::println);
    }
}
