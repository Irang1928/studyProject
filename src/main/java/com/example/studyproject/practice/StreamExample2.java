package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("google", "apple", "google", "apple", "samsung");
        Stream<String> stream1 = strings.stream();
        Stream<String> stream2 = stream1.distinct();
        stream2.forEach(System.out::println);

        System.out.println("-----------------------");

        List<MyString> myStrings = Arrays.asList(new MyString("google"),new  MyString("apple"), new MyString("google"), new MyString("apple"), new MyString("samsung"));
        Stream<MyString> stream3 = myStrings.stream();
        Stream<MyString> stream4 = stream3.distinct();
        stream4.forEach(System.out::println);
    }

    public static class MyString {
        public String str;

        public MyString(String str) {
            this.str = str;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof MyString) {
                return str.equals(((MyString) o).str);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return str.hashCode();
        }

        @Override
        public String toString() {
            return str;
        }
    }
}
