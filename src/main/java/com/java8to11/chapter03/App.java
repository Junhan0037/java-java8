package com.java8to11.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("junhan");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        Stream<String> stream = names.stream().map(String::toUpperCase); // 중계형
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList()); // 종료형

        List<String> parallelStream = names.parallelStream().map((s) -> { // parallelStream() : 병렬 처리
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        parallelStream.forEach(System.out::println);



    }
}
