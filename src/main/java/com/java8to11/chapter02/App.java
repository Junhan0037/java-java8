package com.java8to11.chapter02;

public class App {
    public static void main(String[] args) {

        DefaultFoo foo = new DefaultFoo("junhan");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
