package com.java8to11.chapter02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("junhan");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        for (String n : name) {
            System.out.println(n);
        }
        System.out.println();

        name.forEach(System.out::println);
        System.out.println();

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("======");
        while (spliterator1.tryAdvance(System.out::println));
        System.out.println();

        List<String> j = name.stream().map(String::toUpperCase).filter(s -> s.startsWith("j")).collect(Collectors.toList());

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed()); // 정렬

    }
}
