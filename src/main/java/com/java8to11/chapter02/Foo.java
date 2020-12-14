package com.java8to11.chapter02;

public interface Foo {

    void printName();

    /**
     * @implSpec
     * Default Methods
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    static void printAnything() {
        System.out.println("static");
    }

}
