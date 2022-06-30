package com.example.studyproject.practice;

import java.util.Arrays;
import java.util.List;

public class StreamExample4_2 {
    public static void main(String[] args) {
        List<MyString2> langs2 = Arrays.asList(new MyString2("java"), new MyString2("kotlin"), new MyString2("haskell"), new MyString2("ruby"), new MyString2("smalltalk"));
        langs2.stream().sorted().forEach(System.out::println);
    }

    // MyString class 정의
    public static class MyString2 implements Comparable<MyString2> {
        public String str;

        public MyString2(String str) {
            this.str = str;
        }

        @Override
        public int compareTo(MyString2 o) {
            return Integer.compare(this.str.length(), o.str.length());
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
