package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        List<String> chars = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> stream1 = numbers.stream();
        Stream<String> stream2 = chars.stream();
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
    }
}
