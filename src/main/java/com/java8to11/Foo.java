package com.java8to11;

public class Foo {
    public static void main(String[] args) {

        // 익명 내부 클래스
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        // 람다 표현식
        RunSomething runSomething2 = () -> System.out.println("Hello");
        runSomething2.doIt();

    }
}
