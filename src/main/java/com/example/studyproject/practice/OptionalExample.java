package com.example.studyproject.practice;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String string = "a string in optional";
        Optional<String> opString = Optional.of(string);
        System.out.println(opString.get());

        String nullString = null;
        Optional<String> nullOpString = Optional.ofNullable(nullString);
        try {
            System.out.println(nullOpString.get());
        } catch (NoSuchElementException e) {
            System.out.println("No such element");
        }

        Optional<String> emptyOptional = Optional.empty();
        try {
            System.out.println(emptyOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("No such element");
        }

        // isPresent()
        if (opString.isPresent()) {
            System.out.println("opString: " + opString.get());
        }
        if (nullOpString.isPresent()) {
            System.out.println("nullOpString: " + nullOpString.get());
        }

        // ifPresent()
        opString.ifPresent(s -> System.out.println("opString: " + s));
        nullOpString.ifPresent(s -> System.out.println("nullOpString: " + s));

        // orElse() -- null인 경우 orElse()의 param이 리턴
        String str = opString.orElse("new string from orElse");
        System.out.println(str);
        String str2 = nullOpString.orElse("new string from orElse");
        System.out.println(str2);

        // orElseGet()
        String str3 = opString.orElseGet(() -> "new string from orElseGet");
        System.out.println(str3);

        String str4 = nullOpString.orElseGet(() -> "new string from orElseGet");
        System.out.println(str4);

        // orElseThrow
        try {
            String str5 = opString.orElseThrow(NullPointerException::new);
            System.out.println(str5);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        try {
            String str6 = nullOpString.orElseThrow(NullPointerException::new);
            System.out.println(str6);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // filter
        Optional<String> opStr1 = Optional.of("first string");
        Optional<String> opStr2 = Optional.of("second string");
        Optional<String> filtered1 = opStr1.filter(s -> s.contains("first"));
        Optional<String> filtered2 = opStr2.filter(s -> s.contains("first"));
        filtered1.ifPresent(System.out::println);
        filtered2.ifPresent(System.out::println);
    }
}
