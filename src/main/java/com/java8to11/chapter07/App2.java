package com.java8to11.chapter07;

import java.util.Arrays;

@Chicken("후라이드")
@Chicken("양념")
@Chicken("간장")
public class App2 {
    public static void main(String[] args) {

        Chicken[] chickens = App2.class.getAnnotationsByType(Chicken.class);
        Arrays.stream(chickens).forEach(c -> {
            System.out.println(c.value());
        });

        ChickenContainer chickenContainer = App2.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(c -> {
            System.out.println(c.value());
        });

    }
}
