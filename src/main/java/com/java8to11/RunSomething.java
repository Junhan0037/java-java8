package com.java8to11;

@FunctionalInterface
public interface RunSomething {

    void doIt(); // 추상 메소드를 딱 하나만 가지고 있는 인터페이스 => 함수형 인터페이스(Functional Interface)

    static void pringName() {
        System.out.println("Junhan");
    }

    default void printAge() {
        System.out.println("27");
    }

}
