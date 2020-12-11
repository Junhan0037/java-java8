package com.java8to11;

import java.util.function.*;

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

        /*
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));
         */
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2); // plus10함수 앞쪽에 multiply2과정을 합친다.
        System.out.println(multiply2AndPlus10.apply(2));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2); // plus10함수 뒤쪽에 multiply2과정을 합친다.
        System.out.println(plus10AndMultiply2.apply(2));

        Consumer<Integer> printT = (i) -> System.out.println(i); // 반환타입이 없다.
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10; // 반환값을 지정.
        System.out.println(get10.get());

        Predicate<String> startsWithJunhan = (s) -> s.startsWith("junhan"); // boolean을 리턴

    }
}
