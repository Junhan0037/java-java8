package com.java8to11.chapter07;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<@Egg String> naems = Arrays.asList("junhan");
    }

    static class FeelsLikeChicken<@Egg T> {
        public static <@Egg C> void print(@Egg C c) {
            System.out.println(c);
        }
    }

}
